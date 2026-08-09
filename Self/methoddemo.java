class computerxd
{
    public void display()
    {
        System.out.println("This is a display");
    }
    public String mouse(int cost)
    {
        if (cost >= 1000)
            return("This is an expensive mouse");
        else
            return("This is a cheap mouse");
        
    }
    
}


public class methoddemo 
{
    public static void main(String arg[])
    {
    computerxd obj = new computerxd();
    obj.display();
    System.out.println(obj.mouse(1000));    
    }
}
