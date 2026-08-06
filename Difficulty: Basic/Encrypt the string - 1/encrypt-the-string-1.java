class Solution {
    String encryptString(String s) 
    {
        StringBuilder ans = new StringBuilder();
        
        int i =0;
        
        while(i < s.length())
        {
            char ch = s.charAt(i);
            int count = 1;
            
            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i+1))
            {
                count++;
                i++;
                
            }
            ans.append(ch);
            ans.append(count);
            
            i++;
            
            
        }

        return ans.reverse().toString();


    }
}