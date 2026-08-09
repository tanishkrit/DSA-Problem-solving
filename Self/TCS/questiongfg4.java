public class questiongfg4 
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3};
        int x = 0;

        for(int i = 1 ;i <arr.length; i++)
        {
            while(arr[i]<arr[i-1])
            {
                if(arr[i]<arr[i-1])
                {
                    arr[i]= arr[i]+1;
                    x++;
                }
            }
        }

        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(x);
    }
}
