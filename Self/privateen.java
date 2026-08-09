class speedy 
{
    private String car = "BMW";
    private int speed;

    public speedy()
    {
        car="Mercedes";
    }
    public String getcar()
    {
        return car;
    }
    public void setSpeed(int s)
    {
        speed = s;
    }
    public int getSpeed()
    {
        return speed;
    }


}
public class privateen
{
    public static void main(String args[])
    {
        speedy obj = new speedy();
        System.out.println("Car name is: " + obj.getcar());
        obj.setSpeed(100);
        System.out.println("Speed is: " + obj.getSpeed());
    }
}
