/*Problem Statement:**

You are given an array `nums` of integers. A "peak element" in `nums` is an element which is greater than or equal to its adjacent elements, i.e., `nums[i] >= nums[i-1]` and `nums[i] >= nums[i+1]` for some position `i` (where `0 <= i < nums.length`).

Write a function `findPeakElement(nums)` that returns the index of any peak element in the array. If there are multiple peak elements, you may return the index of any one of them. */


class Solution {
    public int findPeakElement(int[] nums) {

        int s = 0 , e = nums.length-1 ; 
        while(s < e ){
            int mid = s + (e - s )/2 ;
            if(nums[mid] < nums[mid+1]){
                s = mid +1 ;
            }else {
                e = mid ;
            }
        }

        return e ;
        
    }
}






/*Solution Explanation:**

The provided solution uses a binary search approach to find a peak element efficiently. Here's an explanation of how it works:

1. Initialize two pointers, `s` and `e`, to the beginning and end of the array `nums`, respectively, representing the search range.

2. Enter a while loop with the condition `s < e`, which ensures that the search range is valid.

3. Calculate the middle index `mid` as `s + (e - s) / 2`.

4. Compare `nums[mid]` with its right neighbor `nums[mid+1]`. There are two possibilities:
   - If `nums[mid] < nums[mid+1]`, it means the peak element is likely on the right side of `mid`. So, update `s` to `mid + 1` to focus the search on the right half of the array.
   - If `nums[mid] >= nums[mid+1]`, it means the peak element could be at or to the left of `mid`. So, update `e` to `mid` to focus the search on the left half of the array.

5. Repeat steps 3-4 until `s` is no longer less than `e`. At this point, `e` will be pointing to a peak element.

6. Return the value of `e` as the index of a peak element.

The algorithm efficiently narrows down the search space in each step by comparing `nums[mid]` with its right neighbor. If `nums[mid]` is smaller, it indicates that the peak is likely on the right side of `mid`, so the search range is updated accordingly. This binary search process continues until a peak element is found. The algorithm has a time complexity of O(log N), where N is the number of elements in the input array `nums`.*/
