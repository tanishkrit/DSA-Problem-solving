public class questiongfg3 
{
    public static void main(String args[])
    {
        String s = "AAAAABBBCCDAA";
        int count = 1;
        int max = 1;

        for(int i =1;i < s.length();i++)
        {
            if(s.charAt(i) == s.charAt(i-1))
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if(count > max)
            {
                max = count;
            }
        }
        System.out.println(max);


    }
}
