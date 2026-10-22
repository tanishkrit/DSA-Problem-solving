class Solution {
    public List<Integer> findMissingElements(int[] nums) 
    {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            smallest = Math.min(smallest, nums[i]);
            largest = Math.max(largest, nums[i]);
        }

        List<Integer> ans = new ArrayList<>();

        for (int j = smallest; j < largest; j++) 
        {
            boolean found = false;

            for (int i = 0; i < nums.length; i++) 
            {
                if (nums[i] == j) 
                {
                    found = true;
                    break;
                }
            }

            if (!found) 
            {
                ans.add(j);
            }
        }
        return ans;

    }
}