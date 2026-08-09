public class questiongfg
{
    public static void main(String[] args)
    {
        int n = 13;
        System.out.print(n);

        while(n != 1)
        {
            if(n %2 ==0)
            {
                n = n /2;
            }
            else
            {
                n = n* 3+1;
            }
            System.out.print(" " + n);

        }
        return;

    }
}