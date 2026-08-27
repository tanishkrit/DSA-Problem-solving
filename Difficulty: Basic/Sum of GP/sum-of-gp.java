class Solution {
    public int sumOfGP(int n, int a, int r) {

        int x = 0;
        int power = 1;

        for(int i = 1; i <= n; i++)
        {
            x += a * power;
            power *= r;
        }

        return x;
    }
}