import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}

/*
The Java program provided is a simple implementation of the linear search algorithm. Here's a summary of what the program does:

1. It imports the `Scanner` class to facilitate user input.

2. It defines a `linearSearch` method that takes an integer array and a target integer as parameters. This method performs a linear search on the array, looking for the target element, and returns the index where the element is found or -1 if it's not found.

3. In the `main` method:
   - It creates a `Scanner` object for user input.
   - It prompts the user to enter the length of an integer array.
   - It creates an array with the specified length and prompts the user to enter its elements.
   - It asks the user to enter the element they want to search for.
   - It calls the `linearSearch` method to search for the specified element in the array.
   - It displays the result of the search: either the index where the element was found or a message stating that the element was not found.

4. Finally, it closes the `Scanner` object to release system resources.

In essence, this program provides a basic interactive command-line interface for users to input an array, search for a specific element within that array using linear search, and receive feedback on whether the element exists in the array and its index if found.
*/




/* This Java program, named `LinearSearch`, demonstrates the implementation of the linear search algorithm. Linear search is a straightforward searching algorithm that sequentially scans through an array to find a specific target element. Here's how the program works:

1. **Import Statement**: The program imports the `java.util.Scanner` library to facilitate user input.

2. **`linearSearch` Method**:
   - This method takes two parameters: an integer array `arr` and an integer `target`.
   - It uses a `for` loop to iterate through each element in the array, from index 0 to the last index (`arr.length - 1`).
   - Inside the loop, it checks if the current element (`arr[i]`) is equal to the `target`. If a match is found, it returns the index `i`, indicating that the element has been found.
   - If the loop completes without finding the target element, the method returns -1, indicating that the element was not found in the array.

3. **`main` Method**:
   - The `main` method serves as the entry point of the program.
   - It creates a `Scanner` object, `sc`, which allows user input to be read.
   - The program prompts the user to enter the length of the array and reads the input into the variable `len`.
   - An integer array, `arr`, of length `len`, is created to store the elements.
   - The program then prompts the user to enter the elements of the array one by one, and it stores them in the `arr` array.
   - The user is asked to enter the element they want to search for, and the input is stored in the variable `target`.
   - The `linearSearch` method is called with the array `arr` and the target `target`, and the result is stored in the variable `index`.
   - Finally, the program checks the value of `index` and prints whether the element was found or not, along with its index if found.

4. **Closing Scanner**: The program closes the `Scanner` object at the end to release system resources when it's no longer needed.

This program provides a basic, but sometimes less efficient, way to search for an element in an array. It has a time complexity of O(n), where n is the length of the array, as it may need to traverse the entire array in the worst case. For larger arrays or when efficiency is a concern, more advanced search algorithms like binary search (for sorted arrays) or hash-based data structures can offer faster search capabilities.
*/
