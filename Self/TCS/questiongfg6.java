import java.util.Scanner;

public class questiongfg6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 0;
        int s = 0;
        int s1 = 0;
        int s2 = 0;

        // Find total sum
        for(int i = 1; i <= n; i++)
        {
            x = x + i;
        }

        // Check total sum
        if(x % 2 != 0)
        {
            System.out.println("NO");
            return;
        }

        s = x / 2;

        // Find sum of first set
        for(int i = n; i >= 1; i--)
        {
            if(s1 + i <= s)
            {
                s1 = s1 + i;
            }
        }

        System.out.println("YES");

        // Print first set
        int count1 = 0;

        for(int i = n; i >= 1; i--)
        {
            if(count1 + i <= s)
            {
                count1 = count1 + i;
            }
        }

        // Count elements in first set
        int c1 = 0;
        int temp = 0;

        for(int i = n; i >= 1; i--)
        {
            if(temp + i <= s)
            {
                temp = temp + i;
                c1++;
            }
        }

        System.out.println(c1);

        // Print elements of first set
        temp = 0;

        for(int i = n; i >= 1; i--)
        {
            if(temp + i <= s)
            {
                System.out.print(i + " ");
                temp = temp + i;
            }
        }

        System.out.println();

        // Count elements in second set
        int c2 = n - c1;

        System.out.println(c2);

        // Print second set
        temp = 0;

        for(int i = n; i >= 1; i--)
        {
            if(temp + i <= s)
            {
                temp = temp + i;
            }
            else
            {
                System.out.print(i + " ");
            }
        }
    }
}