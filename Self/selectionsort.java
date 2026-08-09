public class selectionsort 
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
                for(int j =0 ; j< nums.length ; j++)
                {
                    if(nums[j] > nums[i])
                    {
                        int t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
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
