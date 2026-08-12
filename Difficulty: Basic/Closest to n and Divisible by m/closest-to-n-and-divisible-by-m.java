class Solution {
    static int closestNumber(int n, int m) {

        int q = n / m;

        int n1 = m * q;
        int n2;

        if ((n * m) > 0) {
            n2 = m * (q + 1);
        }
        else {
            n2 = m * (q - 1);
        }

        int d1 = Math.abs(n - n1);
        int d2 = Math.abs(n - n2);

        if (d1 < d2) {
            return n1;
        }
        else if (d2 < d1) {
            return n2;
        }
        else {
            if (Math.abs(n1) > Math.abs(n2)) {
                return n1;
            }
            else {
                return n2;
            }
        }
    }
}