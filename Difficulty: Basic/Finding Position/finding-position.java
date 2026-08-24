class Solution {
    static long nthPosition(long n) 
    {
        long x = 1;
        
        while(x * 2 <= n)
        {
            x = x * 2;
        }
        
        return x;
    }
}