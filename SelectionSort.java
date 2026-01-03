/*  3,1,6,2,5 = 1,3,6,2,5 = 1,2,6,3,5 = 1,2,3,6,5 = 1,2,3,5,6 */
public class SelectionSort {
    public static void selectionSort(int[] arr)
    {
          int n=arr.length;
          for(int i=0;i<n-1;i++)
          {
            int indexOfMinElement=i;
            for(int j=i+1;j<n;j++){
               if(arr[j]<arr[indexOfMinElement])
               {
                indexOfMinElement=j;
               }
               if(indexOfMinElement!=i)
               {
                int temp=arr[indexOfMinElement];
                arr[indexOfMinElement]=arr[i];
                arr[i]=temp;
               }
            }
          }
    }
}
