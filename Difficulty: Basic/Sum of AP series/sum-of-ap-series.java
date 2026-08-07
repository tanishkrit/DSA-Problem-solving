class Solution {
    public int sumOfAP(int n, int a, int d) 
    {
        
        int o=0;
        
        for(int i=0; i < n; i++)
        {
            o += (a+ (i*d));
        }
        return o;
    
    }
};