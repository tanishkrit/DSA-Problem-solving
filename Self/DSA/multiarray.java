public class multiarray
{
    public static void main(String args[])
    {
        int x[][]= new int [5][7];

        for(int i=0; i<=4; i++)
        {
            for(int j=0; j<=6; j++)
            {
                x[i][j] = (int)(Math.random()*10);
            }
            System.out.println();
        }

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<=6; j++)
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();

        }


    }    
}
