class Solution {
    void swapTriangle(int mat[][]) 
    {
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = i + 1; j < mat.length; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
    }
};