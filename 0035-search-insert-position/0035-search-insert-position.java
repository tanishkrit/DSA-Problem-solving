class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int x = 0;

        if(nums[nums.length - 1] < target)
        {
            x = nums.length;
        }
        else
        {
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == target)
                {
                    x = i;
                }
                if(target > nums[i] && target < nums[i+1])
                {
                    x = i + 1;
                }
            }
        }    
        return x;
    }
}