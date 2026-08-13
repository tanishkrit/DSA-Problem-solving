
class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) 
    {
        int x = 0;
        int y = a2 - a1;
        
        for(int i = 0; i < n; i++)
        {
            x = a1 + (y * i);
        }
        return x;
    }
}
