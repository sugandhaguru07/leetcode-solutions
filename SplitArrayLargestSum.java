/* Given an array nums whixh consist of non negative integers and an integer m, 
we can split the array into m non empty continuous subarrays. Write na algorithm 
to minimize the largest sum among m subarrays.
*/
public class SplitArrayLargestSum {
    public static int splitArray(int[] arr, int m)
    {
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<end)
        {
          int mid=start+(end-start)/2;
          int sum=0;
          int split=1;
          for(int i=0;i<arr.length;i++){
          if(sum+arr[i]>=mid)
          {
            split++;
            sum=arr[i];
          }
          else{
            sum+=arr[i];
           }
        }
        if(split<=m)
        {
            end=mid;
        }
        else{
            start=mid+1;
        }
     }
     return end;
    }   
}
