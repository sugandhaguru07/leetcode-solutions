public class SortedMatrixSearch {
    public static int[] search(int[][] arr, int t)
    {
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col<arr[0].length)
        {
          if(t==arr[row][col])
          {
            return new int[] {row,col};
            break;
          }
          else if(t<arr[row][col])
          {
            col--;
          }
          else{
            row++;
          }
        }
        return new int[] {-1,-1};
    }
}
