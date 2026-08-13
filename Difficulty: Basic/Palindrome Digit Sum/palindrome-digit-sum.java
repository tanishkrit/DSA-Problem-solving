class Solution {
    boolean isDigitSumPalindrome(int n) 
    {
        int x = 0;
        
        while(n != 0)
        {
            x += n % 10;
            n = n / 10;
        }
    
        int z = x;
        int y = 0;
        
        while(x != 0)
        {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        if(z == y)
        {
            return true;
        }
        return false;

    }
}