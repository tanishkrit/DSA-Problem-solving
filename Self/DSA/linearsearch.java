public class linearsearch 
{
    public static int linearSearch(int nums[], int target)
    {
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int nums[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 21;

        int result = linearSearch(nums, target);

        if(result != 0)
        {
            System.out.println("Element found at index: " + result);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
