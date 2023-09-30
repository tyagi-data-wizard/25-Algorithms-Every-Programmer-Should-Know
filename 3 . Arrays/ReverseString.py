"""Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}
Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}"""

# Function to reverse A[] from start to end
def reverseList(A, start, end):
	while start < end:
		A[start], A[end] = A[end], A[start]
		start += 1
		end -= 1

# Driver function to test above function
A = [1, 2, 3, 4, 5, 6]
print(A)
reverseList(A, 0, 5)
print("Reversed list is")
print(A)
# This program is contributed by Pratik Chhajer
