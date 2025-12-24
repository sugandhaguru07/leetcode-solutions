public class LongestMountainInArray {
    public static int longestMountain(int[] arr)
    {
        int n=arr.length;
          //0,1,0,2,4,6,5,4,3,4-- Loop ,to check an array element is a peak element or not, will start from 1st index and will end at 8th index. 0th indexed and 9th indexed element isn't used to check whethe they re peak element or not because a mountain peak must have left and right valley, but 1st element doesn't have left valley and last element doesn't have right valley that's why. 
          int maxLen=0;
          int i=1;
        while(i<n-1)
        {
             if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
             {
                int left=i, right=i;
                while(left>0 && arr[left]>arr[left-1])
                {
                    left--;
                }
                while(right<n-1 && arr[right]>arr[right+1])
                {
                    right++;
                }
                maxLen=Math.max(maxLen, right-left+1);
                i=right;
             }
             else{
                i++;
             }
        }
        return maxLen;
    }
}

//Time complexity is o(n).
