Steps to implement the algorithm :
Step 1 – Find a candidate with the majority –

Initialize a variable say i ,votes = 0, candidate =-1 
Traverse through the array using for loop
If votes = 0, choose the candidate = arr[i] , make votes=1.
else if the current element is the same as the candidate increment votes
else decrement votes.
Step 2 – Check if the candidate has more than N/2 votes –

Initialize a variable count =0 and increment count if it is the same as the candidate.
If the count is >N/2, return the candidate.
else return -1.
Dry run for the above example: 
Given :
  arr[]=        1    1    1    1    2    3    5
 votes =0       1    2    3    4    3    2    1
 candidate = -1 1    1    1    1    1    1    1
 candidate = 1  after first traversal
                1    1    1    1    2    3    5
 count =0       1    2    3    4    4    4    4 
 candidate = 1  
 Hence count > 7/2 =3
 So 1 is the majority element.

CODE:
import java.io.*;

class GFG
{

// Function to find majority element
public static int findMajority(int[] nums)
{
	int count = 0, candidate = -1;

	// Finding majority candidate
	for (int index = 0; index < nums.length; index++) {
	if (count == 0) {
		candidate = nums[index];
		count = 1;
	}
	else {
		if (nums[index] == candidate)
		count++;
		else
		count--;
	}
	}

	// Checking if majority candidate occurs more than
	// n/2 times
	count = 0;
	for (int index = 0; index < nums.length; index++) {
	if (nums[index] == candidate)
		count++;
	}
	if (count > (nums.length / 2))
	return candidate;
	return -1;

	// The last for loop and the if statement step can
	// be skip if a majority element is confirmed to
	// be present in an array just return candidate
	// in that case
}

// Driver code
public static void main(String[] args)
{
	int arr[] = { 1, 1, 1, 1, 2, 3, 4 };
	int majority = findMajority(arr);
	System.out.println(" The majority element is : "
					+ majority);
}
}

// This code is contributed by Arnav Sharma
