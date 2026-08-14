class Solution {
    public boolean isStrong(int n) 
    {
        int x = 0;
        int y = 1;
        int z = 0;
        int sum = n;
        
        while( n != 0)
        {
            x = n % 10;
            n = n / 10;
            for(int i = 1; i <= x ;i++)
            {
                y *= i;
            }
            z += y;
            x = 0;
            y = 1;
        }
        if(z == sum)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
}