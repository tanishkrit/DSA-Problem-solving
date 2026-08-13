class Solution {
    public int sumUnderModulo(int a, int b, int M) 
    {
        
        int x = 0;
        int y = a + b;
        
        // for(int i = 1; M*i < y; i++)
        // {
        //     if(M*i > y)
        //     {
        //         int z = M*i;
        //         x = y - (z-M);
        //     }
        // }
        // return x;
        x = y % M;
        return x;
    }
}
