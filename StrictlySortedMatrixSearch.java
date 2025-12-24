public class StrictlySortedMatrixSearch {
  public static int[] search(int[][] arr,int t) 
  {
      int row=arr.length;
      int col=arr[0].length;
      int rows=-1;
      while(row<arr.length && col<arr[0].length)
      {
        int top=0;
        int bottom=row-1;
        int midRow=top+(bottom-top)/2;
        if(t>=arr[midRow][0] && t<=arr[midRow][col-1])
        {
            rows=midRow;
            break;
        }
        else if(t<arr[midRow][0])
        {
            bottom=midRow-1;
        }
        else{
            top=midRow+1;
        }
      }
      if(rows==-1){
        return new int[] {-1,-1};
      }
      int start=0, end=col-1;
      while(start<=end)
      {
        int mid=start+(end-start)/2;
        if(t==arr[rows][mid]){
            return new int[]{rows,mid};
        }
        else if(t<arr[rows][mid]){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
      }
      return new int[] {-1,-1};
  }
}
