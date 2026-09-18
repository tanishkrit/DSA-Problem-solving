class Solution {
    public static void utility(String s) {
        // code here
        String ans = "";
        
        for(int i = 0; i < s.length(); i++)
        {
            if(i % 2 == 0)
            {
                ans = ans + s.charAt(i);
            }
        }
        System.out.print(ans);
    }
}