class Solution {
    static int isSumPalindrome(int n) 
    {
        int x = 0;
        int y = n;
        int z = 0;
        
        for(int i = 0; i < 5; i++)
        {
            x = 0;
            y = n;

            while(n != 0)
            {
                x = x * 10 + (n % 10);
                n = n / 10;
            }
            
            if(x == y)
            {
                return y;
            }
            else
            {
                z = x + y;
            }

            n = z;

            x = 0;

            while(n != 0)
            {
                x = x * 10 + (n % 10);
                n = n / 10;
            }

            if(x == z)
            {
                return z;
            }

            n = z;
        }

        return -1;
    }
}