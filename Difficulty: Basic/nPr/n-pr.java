class Solution {
    public long nPr(int n, int r) 
    {
        long x = 1;
        for(int i = 1; i <= n ; i++)
        {
            x *= i;
        }
        long y = n - r;
        long z = 1;
        for(int i = 1; i <= y ; i++)
        {
            z *= i;
        }
        long sum = x / z;
        return sum;
    }
}