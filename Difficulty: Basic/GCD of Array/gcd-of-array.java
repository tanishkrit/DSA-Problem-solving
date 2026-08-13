class Solution {
    public int gcd(int n, int arr[])
    {
        int x = arr[arr.length - 1];
        int y = 0;

        for(int i = x; i >= 1; i--)
        {
            boolean flag = true;

            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] % i != 0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag)
            {
                y = i;
                break;
            }
        }

        return y;
    }
}