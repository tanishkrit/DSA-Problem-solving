class Solution
{
    String uncommonChars(String s1, String s2)
    {
        String ans = "";

        for(int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);

            if(s2.indexOf(ch) == -1 && ans.indexOf(ch) == -1)
            {
                ans = ans + ch;
            }
        }

        for(int i = 0; i < s2.length(); i++)
        {
            char ch = s2.charAt(i);

            if(s1.indexOf(ch) == -1 && ans.indexOf(ch) == -1)
            {
                ans = ans + ch;
            }
        }

        if(ans.equals(""))
        {
            return "";
        }

        char[] arr = ans.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }
}