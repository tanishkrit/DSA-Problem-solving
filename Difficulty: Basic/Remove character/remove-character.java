class Solution {
    static String removeChars(String str1, String str2) 
    {
        StringBuilder ans = new StringBuilder();
        
        for(int i =0; i < str1.length(); i++)
        {
            char ch = str1.charAt(i);
            if(str2.indexOf(ch) == -1)
            {
                ans.append(ch);
            }
        }
        return ans.toString();
        
        
        
        
    }
}