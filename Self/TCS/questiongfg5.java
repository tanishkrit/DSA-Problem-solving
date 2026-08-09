public class questiongfg5 
{
    public static void main(String args[])
    {
        int n = 5;

        if(n == 2 || n == 3)
        {
            System.out.println("No solution");
        }
        else
        {
            for(int i = 2; i <= n; i+=2)
            {
                System.out.print(i + " ");
            }
            for(int i = 1; i <= n; i+=2)
            {
                System.out.print(i + " ");
            }
        }
    }    
}
