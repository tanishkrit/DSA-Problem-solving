class Solution {
    public boolean isPower(int x, int y) {

        if (x == 1)
            return y == 1;

        while (y > 1) {
            if (y % x != 0)
                return false;

            y = y / x;
        }

        return true;
    }
}