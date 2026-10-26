class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) 
    {

        int rows = mat.length;
        int cols = mat[0].length;
        
        int trans[][] = new int[cols][rows];
        
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[i].length;j++)
            {
                trans[j][i] = mat[i][j];
            }
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < cols; i++) 
        {
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < rows; j++) 
            {
                row.add(trans[i][j]);
            }
            ans.add(row);
        }
        return ans;
    }
}