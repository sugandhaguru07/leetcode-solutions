/* Merge given two sorted arrays. The resultant array must be sorted. */
import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] mergeArray(int[] arr1,int[] arr2)
    {
        int[] res=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
           if(arr1[i]<=arr2[j])
           {
            res[k++]=arr1[i++];
           }
           else{
            res[k++]=arr2[j++];
           }
        }
        while (i<arr1.length) {
            res[k++]=arr1[i++];
        }
        while(j<arr2.length){
            res[k++]=arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr1[]={2,4,8,13};
        int arr2[]={6,9,15,16,20};
        int arr[]=mergeArray(arr1, arr2);
        System.out.println("Merged array is:"+Arrays.toString(arr));
    }
}


/* Two pointer approach is used here. It's an efficient optimal solution with best time cmplexity O(arr1.length+arr2.length)
Two pointer is used to compare the element of two arrays, and atlast remaining array elements are included in the resultant array.
*/