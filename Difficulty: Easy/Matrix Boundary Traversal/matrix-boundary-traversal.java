class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        // Top row
        for(int i = 0; i < cols; i++) 
        {
            ans.add(mat[0][i]);
        }
        
        // Right column
        for(int i = 1; i < rows; i++) 
        {
            ans.add(mat[i][cols - 1]);
        }
        
        // Bottom row
        if(rows > 1) 
        {
            for(int i = cols - 2; i >= 0; i--) 
            {
                ans.add(mat[rows - 1][i]);
            }
        }
        
        // Left column
        if(cols > 1) 
        {
            for(int i = rows - 2; i > 0; i--) 
            {
                ans.add(mat[i][0]);
            }
        }
        
        return ans;
    }
}
