class Solution {
    public static char getMaxOccuringChar(String s) 
    {
        int n = s.length();
        int f[] = new int[26];
        
        for(int i = 0; i < n;i++)
        {
            f[s.charAt(i)-'a']++;
        }
        int max=0;
        char ans = 'a';
        for(int i =0;i<26;i++)
        {
            if(f[i] > max)
            {
                max = f[i];
                ans = (char)(i + 'a');
            }
        }
        return ans;

    }
}