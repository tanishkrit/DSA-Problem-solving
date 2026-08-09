import java.util.Scanner;

public class calculate 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            int zi = (2 * i % 2) + (2 * i / 2);
            System.out.println(zi);
        }

        scanner.close();
    }
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
