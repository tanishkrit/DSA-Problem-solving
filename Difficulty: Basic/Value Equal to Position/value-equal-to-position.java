class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < arr.length;i++)
        {
            if(i + 1 == arr[i])
            {
                ans.add(i+1);
            }
        }
        return ans;
    }
}
