/* Given a m*n grid, find the number of islands where '1' indicates a land and '0' indicates water.
We can only go horixontally and vertically.
*/
public class NoOfIslandsDFS {
    public static int islandsDFS(char[][] grid)
    {
        if(grid==null || grid.length==0 || grid[0].length==0) return 0;
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    numOfIsland(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    private static void numOfIsland(char[][] grid,int i,int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]== '0')
        {
            return;
        }
        grid[i][j]='0';
        numOfIsland(grid, i+1, j);
        numOfIsland(grid, i-1, j);
        numOfIsland(grid, i, j+1);
        numOfIsland(grid, i, j-1);
    }
}

/* Check left,right,top,down of a cell at a time and move in the direction where we found
'1' marked cell. Mark the current cell as visited so that we will not explore the cel again 
in future.
Keep a variable 'count' to count total number of islands found in the given grid.
Stopping criterias are 1) if row is negative or 2) column is negative or 3)row no is more than or 
equal to the length of grid or 4) column no is more than or equal to the length of 1st row of the grid.
We will mark a cell as '0' to declare it as visited.
We will check each cell of the grid whether it is '0' or '1'- if it is '1' then 
we will apply our dfs logic and increment the count by 1.
At the end count will be returned as output.
*/
 