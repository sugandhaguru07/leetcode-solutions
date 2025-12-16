public class MaxSubarray {
    public static int maxSubArray(int[] arr)
    {
       int start=arr[0], max=arr[0];
       for(int p=1;p<arr.length;p++)
       {
         start=Math.max(arr[p],start+arr[p]);
         max=Math.max(start,max);
       }
       return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubarray.maxSubArray(arr));
    }
}

/* Logic : To find the subarray with maximum sum of elements:
1. we are initializing "start" variable with array's first element value. This start variable is used to find the element from where
the suarray will start.
2. We are initializing "max" variable with array's first element value and will be used to calculate the maximum sum of subarray.
3. We will apply a loop which will start from array's 2nd element as we are using the 1st one as current and max already.
  a) In the loop ,we will update the start var by comparing the current element and (start ele+current ele) to find the maximum one for updating the start 
ex- {-2,1,-3,...} If start=-2 and current element=1 then updated start= max(1,(-2+1))=1
  b) max will be updated by comparing current max and updated start var ,and will take the max one.
4. At the end max will be returned.
*/
