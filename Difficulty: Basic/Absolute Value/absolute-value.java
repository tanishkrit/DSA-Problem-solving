class Solution {
    public int absolute(int n) {

        if(n < 0)
        {
            n = n * (-1);
        }
        else if(n > 0)
        {
            n = n;
        }
        else
        {
            n = 0;
        }
        return n;
    }
}
