// Given an array Arr that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

// Example 1:

// Input:
// N = 5
// Arr[] = {6, -3, -10, 0, 2}
// Output: 180
// Explanation: Subarray with maximum product
// is 6, -3, -10 which gives product as 180.
// Example 2:

// Input:
// N = 6
// Arr[] = {2, 3, 4, 5, -1, 0}
// Output: 120
// Explanation: Subarray with maximum product
// is 2, 3, 4, 5 which gives product as 120.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function maxProduct() which takes the array of integers arr and n as parameters and returns an integer denoting the answer.
// Note: Use 64-bit integer data type to avoid overflow.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
       long max=1,globalMax=1,min =1;
       
       for(int i=0;i<n;i++)
       {
           if(arr[i]==0)
           {
               min =1;
               max=1;
           }
           else if(arr[i]<0)
           {
               long temp=min;
               min=max;
               max=temp;
           }
           max = Math.max(arr[i],arr[i]*max);
           min =Math.min(arr[i],arr[i]*min);
           
           if(max> globalMax)
            globalMax=max;
       }
       if(arr.length==1 && arr[0]==0)
       return 0;
       return globalMax;
    }
}