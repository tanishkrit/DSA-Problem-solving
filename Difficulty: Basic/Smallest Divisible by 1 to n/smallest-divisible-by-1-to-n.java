class Solution {
    public static long getSmallestDivNum(int n) {
        long x = 1;

        for (int i = 2; i <= n; i++) {
            x = lcm(x, i);
        }

        return x;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}