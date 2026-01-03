import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        boolean swap=true;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;              
                    swap=true;
                }
                if(!swap)
                {
                    break;
                }
            }
        }  
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,6,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
