class Solution {
    public void rotate(int[] arr) 
    {
        // ArrayList<Integer> nums = new ArrayList<>();
        
        // nums.add(arr[arr.length -1]);
        // for(int i = 0; i < arr.length -1; i++)
        // {
        //     nums.add(arr[i]);
        // }
        // return nums;
        
        
        int temp = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--) 
        {
        
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
        
    }
}