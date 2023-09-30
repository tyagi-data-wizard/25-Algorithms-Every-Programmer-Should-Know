import java.util.Random;

public class QuickSelect {

    public static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left];
        }

        int pivotIndex = partition(arr, left, right);
        
        if (k == pivotIndex) {
            return arr[k];
        } else if (k < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int randomPivot = new Random().nextInt(right - left + 1) + left;
        swap(arr, randomPivot, right);
        int pivot = arr[right];
        int i = left - 1;
        
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2; // Find the 3rd smallest element

        int result = quickSelect(arr, 0, arr.length - 1, k);
        System.out.println("The " + (k + 1) + "th smallest element is: " + result);
    }
}


/*The provided Java code defines a `QuickSelect` class that implements the QuickSelect algorithm to find the kth smallest element in an unsorted integer array efficiently. Here's a short description:

- The `quickSelect` method takes an integer array `arr`, a left index `left`, a right index `right`, and an integer `k` as input.
- It recursively selects a pivot element, partitions the array such that smaller elements are on the left, and larger or equal elements are on the right.
- If the pivot index equals `k`, it returns the kth smallest element.
- If `k` is less than the pivot index, it recursively calls `quickSelect` on the left subarray.
- If `k` is greater than the pivot index, it recursively calls `quickSelect` on the right subarray.
- The `partition` method chooses a random pivot element within the given range and rearranges elements accordingly.
- The `swap` method swaps two elements in an integer array.
- In the `main` method, an example array is provided, and the code finds the 3rd smallest element (k = 2) using the `quickSelect` method and prints the result to the console.*/
