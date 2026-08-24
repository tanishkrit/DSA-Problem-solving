class Solution {
    static int cubeRoot(int n)
    {
        int x = 0;

        for(int i = 1; i <= n; i++)
        {
            if(i * i * i <= n)
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