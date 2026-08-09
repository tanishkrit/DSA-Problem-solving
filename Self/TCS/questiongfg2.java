public class questiongfg2
{
    public static void main(String args[])
    {
        int[] arr = {1, 2, 3, 5};

        int n = arr.length + 1;

        for(int i = 1; i <= n; i++)
        {
            int found = 0;

            for(int num : arr)
            {
                if(num == i)
                {
                    found = i;
                    break;
                }
            }

            if(found == 0)
            {
                System.out.print(i);
            }
        }
    }
}
