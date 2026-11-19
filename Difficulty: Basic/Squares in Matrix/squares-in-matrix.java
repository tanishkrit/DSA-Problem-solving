class Solution {
    public int squaresInMatrix(int m, int n) 
    {
        int count = 0;

        for(int k = 1; k <= Math.min(m, n); k++) 
        {

            count += (m - k + 1) * (n - k + 1);

        }

        return count;
        
    }
};
