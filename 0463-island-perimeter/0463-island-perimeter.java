class Solution {
    public int islandPerimeter(int[][] grid) {
        int a=4,s=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) {
                    
                        if(i>0 &&grid[i-1][j]==1) a--;
                        if(i+1<grid.length && grid[i+1][j]==1) a--;
                        if(j>0 && grid[i][j-1]==1) a--;
                        if(j+1<grid[0].length && grid[i][j+1]==1) a--;
                        
                        s=s+a;

                    a=4;
                }
            }
        }
    return s;
    }
}