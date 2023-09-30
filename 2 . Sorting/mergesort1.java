// L : Left Sub Array , R : Right Sub Array , A : Array

merge(L, R, A)
{
    nL = length(L)    // Size of Left Sub Array
    nR = length(R)    // Size of Right Sub Array

    i = j = k = 0

    while(i<nL && j<nR)
    {
      /* When both i and j are valid i.e. when both the sub arrays have elements to insert in A */
      
       if(L[i] <= R[j])
       {
          A[k] = L[i]
          k = k+1
          i = i+1
       }
       else
       {
          A[k] = R[j]
          k = k+1
          j = j+1
       }
    }

    // Adding Remaining elements from left sub array to array A
    while(i<nL)
    {
       A[k] = L[i]
       i = i+1
       k = k+1
    }

    // Adding Remaining elements from right sub array to array A
    while(j<nR)
    {
       A[k] = R[j]
       j = j+1
       k = k+1
    }
}
/*In merge sort, we divide the array into two (nearly) equal halves and solve them recursively using merge sort only*/
