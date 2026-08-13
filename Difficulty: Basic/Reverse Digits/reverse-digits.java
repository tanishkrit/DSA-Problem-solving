class Solution {
    public int reverseDigits(int n) 
    {

        int x = 0;

        while(n != 0)
        {
            x = x * 10 + n % 10;
            n = n / 10;
        }
        return x;
    }
}