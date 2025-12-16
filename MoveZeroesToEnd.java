/* Move the zeroes present in the array to the end */
import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void zeroesToEnd(int[] arr)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,3,0,4,0,5};
        MoveZeroesToEnd.zeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}

