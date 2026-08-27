class Solution {
    public int[] findSum(int n) 
    {
        int o = 0;
        int e = 0;
        
        for(int i = 1; i <= n ; i++ )
        {
            if(i % 2 == 0)
            {
                o += 0;
            }
            else
            {
                o += i;
            }
        }

        
        for(int i = 1; i <= n ; i++ )
        {
            if(i % 2 == 0)
            {
                e += i;
            }
            else
            {
                e += 0;
            }
        }
        // return e;
        return new int[]{o, e};
    }
}