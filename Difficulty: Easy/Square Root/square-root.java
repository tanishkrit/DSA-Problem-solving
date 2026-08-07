class Solution {
    int floorSqrt(int n) 
    {
        
        int x=0;
        for (int i = 0; i <= n; i++) 
        {
            if (i * i <= n) 
            {
                x = i;
            } 
            else 
            {
                break;
            }
        }

        return x;
    
    
    }
}