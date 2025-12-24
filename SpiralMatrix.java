import java.util.ArrayList;

public class SpiralMatrix{
    public static ArrayList<Integer> spiralMatrix(int[][] arr)
    {
        ArrayList<Integer> result=new ArrayList<>();  
        int row=arr.length;
        int col=arr[0].length;    
        int left=0,right=col-1;
        int top=0,bottom=row-1;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                result.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                result.add(arr[i][right]);
            }
            right--;
            if(top<=bottom)
            {
               for(int i=right;i>=left;i--) 
               {
                  result.add(arr[bottom][i]);
               }
               bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    result.add(arr[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
/* 
   [[1,2,3,4] 
    [5,6,7,8] 
    [9,1,5,2]
    [4,3,1,8]]
    Here wwe have to print the array elements in spiral order.
    Outpot will be [1,2,3,4,8,2,8,1,3,4,9,5,6,7,5,1].
    We maintain 4 boundaries-top,bottom,left, and right.
    And we will move in 4 directions:
    left to right, top to bottom, right to left, and bottom to top.
    After each step we will shrink the boundary.
*/