public class enloop
{
    public static void main(String args[])
    {
        int x[][][] = new int [3][4][5];

        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x[i].length; j++)
            {
                for(int k=0; k<x[i][j].length; k++)
                {
                    x[i][j][k] = (int)(Math.random()*10);
                }
            }
        }
        
        
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x[i].length; j++)
            {
                for(int k=0; k<x[i][j].length; k++)
                {
                    System.out.print(x[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    


    }
}