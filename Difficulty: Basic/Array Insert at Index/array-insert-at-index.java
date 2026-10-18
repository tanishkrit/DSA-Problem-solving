import java.util.*;

class Solution {
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) 
    {
        arr.add(0);
        
        for (int i = arr.size() - 1; i > index; i--) 
        {
            arr.set(i, arr.get(i - 1));
        }
        
        arr.set(index, val);
    }
}
