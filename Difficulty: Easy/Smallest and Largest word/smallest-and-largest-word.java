class Solution {
    public ArrayList<String> smallerAndLarge(String s) 
    {
        String[] words = s.trim().split("\\s+");        
        String smallest = words[0];
        String largest = words[0];
        
        for(String word : words)
        {
            if(word.length() < smallest.length())
            {
                smallest = word;
            }
            if(word.length() >= largest.length())
            {
                largest= word;
            }
    
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        ans.add(smallest);
        ans.add(largest);
        
        
        return ans;
        
        
    
        
        
    }
}