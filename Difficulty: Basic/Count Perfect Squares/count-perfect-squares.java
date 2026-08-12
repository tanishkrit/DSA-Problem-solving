class Solution {
    static int countSquares(int n) 
    {
    
        int sum = 0;
        
        for(int i = 1; i*i < n; i++)
        {
            sum++;
        }
        return sum;
    }
}