class Solution {
    int middle(int a, int b, int c)
    {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        return a + b + c - max - min;
    }
}