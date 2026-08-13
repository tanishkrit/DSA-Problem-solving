class Solution {
    static long kthDigit(int a, int b, int k)
    {
        long x = (long)Math.pow(a, b);
        long y = 0;
        
        for(int i = 1; i <= k; i++)
        {
            y = x % 10;
            x = x /10;
        }
        return y;
    }
}