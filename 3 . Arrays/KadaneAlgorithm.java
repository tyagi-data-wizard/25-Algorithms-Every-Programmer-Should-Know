public class KadaneAlgorithm {

    public static int maxSubarraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubarraySum(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}

/*This Java code implements the Kadane's Algorithm to find the maximum subarray sum of an array of integers. Here's a brief explanation:

The maxSubarraySum method takes an integer array nums as input and returns the maximum sum of a subarray within the given array.

It initializes two variables, maxEndingHere and maxSoFar, both initially set to the first element of the array (nums[0]).

It then iterates through the array starting from the second element (index 1) and does the following in each iteration:

maxEndingHere is updated to the maximum value between the current element nums[i] and the sum of maxEndingHere and nums[i]. This represents the maximum subarray sum ending at the current element.
maxSoFar is updated to the maximum value between maxSoFar and maxEndingHere. This keeps track of the maximum subarray sum seen so far as the loop progresses.
After iterating through the entire array, the method returns the value of maxSoFar, which represents the maximum subarray sum.

In the main method, an example array nums is defined, and the maxSubarraySum method is called to find the maximum subarray sum. The result is printed to the console.

In your example with nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}, the output will be: "Maximum Subarray Sum: 6", as the maximum subarray with the highest sum is {4, -1, 2, 1} with a sum of 6.*/
