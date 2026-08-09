public class bubblesort
{
    public static void main(String[] args)
        {
            int nums[]={5, 2, 9, 1, 5, 6};
            // System.out.println(nums);
            for(int num : nums)
            {
                System.out.print(num + " ");
            }
            System.out.println();
            for(int i = 0;i < nums.length; i++)
            {
                for(int j =0 ; j< nums.length -1 ; j++)
                {
                    if(nums[j] > nums[j+1])
                    {
                        int t = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = t;
                    }    
                }   
            }
            System.out.println("After Sorting:");
            for(int num : nums)
            {
                System.out.print(num + " ");
            }            


        }
}