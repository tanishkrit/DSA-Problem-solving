class Solution {
    public String longest(String[] arr) 
    {
        String ans = arr[0];
        
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i].length() > ans.length())
            {
                ans = arr[i];
            }
        }
        
        return ans;
        
    }
}