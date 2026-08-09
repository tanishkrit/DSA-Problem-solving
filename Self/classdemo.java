class calculator
{
    int a,b;
    int add(int x, int y)
    {
        return x + y;

    }
}


public class classdemo
{
    public static void main(String arg[])
    {
        int a = 10;
        int b = 20;
        calculator obj = new calculator();
        System.out.println("Addition of a and b is: " + obj.add(a,b));
    }
    
}
