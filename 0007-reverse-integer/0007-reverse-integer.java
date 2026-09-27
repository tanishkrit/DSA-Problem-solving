class Solution {
    public int reverse(int x) 
    {
        int org = x;
        long r = 0;
        if(org < 0)
        {
            x = x * -1;
        } 

        while(x > 0)
        {
            int y = x % 10;
            r = (r * 10) + y;
            x = x / 10;
        }   
        if(org < 0)
        {
            r = r * -1;
        } 
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) r;
    }
}