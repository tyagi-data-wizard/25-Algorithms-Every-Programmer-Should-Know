Question 1:

Given an array of integers, write a Java function to find the maximum sum subarray using Kadane's algorithm. The maximum sum subarray is the contiguous subarray 
with the largest sum.

Code:
public class KadaneAlgorithm {

    public static int maxSubArraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArraySum(nums);

        System.out.println("Maximum sum of subarray: " + result);
    }
}


Question 2:

Extend the Kadane's algorithm to return the starting and ending indices of the maximum sum subarray in addition to the sum. Write a Java function to achieve this.

Code:
public class KadaneWithIndices {

    static class Result {
        int start;
        int end;
        int maxSum;

        Result(int start, int end, int maxSum) {
            this.start = start;
            this.end = end;
            this.maxSum = maxSum;
        }
    }

    public static Result findMaxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int tempStart = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum = currentSum + nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        return new Result(start, end, maxSum);
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Result result = findMaxSubArray(nums);

        System.out.println("Maximum sum of subarray: " + result.maxSum);
        System.out.println("Start index: " + result.start);
        System.out.println("End index: " + result.end);
    }
}
