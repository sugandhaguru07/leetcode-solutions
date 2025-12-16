public class BinarySearch {
    public static int binarySearch(int[] arr,int tgt)
    {
        int low=0,high=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==tgt)
            {
                return mid;
            }
            else if(tgt<arr[mid])
            {
               high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
