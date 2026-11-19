class Solution {
    public boolean sumOfRowCol(int[][] mat) 
    {
        int rsum = 0;
        int csum = 0;
        

        for(int i = 0; i < Math.min(mat.length, mat[0].length); i++)
        {
            for(int j = 0; j < mat[i].length; j++)
            {
                rsum += mat[i][j];
            }
        
            for(int j = 0; j < mat.length; j++)
            {
                csum += mat[j][i];
            }
            
            if(rsum != csum)
            {
                return false;
            }
            
            rsum = 0;
            csum = 0;
        }
        
        return true;
        
    }
}