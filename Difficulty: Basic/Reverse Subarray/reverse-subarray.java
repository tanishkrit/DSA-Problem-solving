class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
                                                     int r) 
    {
        l--;
        r--;
        
        while(l < r)
        {
            int temp = arr.get(r);
            arr.set(r, arr.get(l));
            arr.set(l, temp);
            
            r--;
            l++;
        }
        
        return arr;
    }
}