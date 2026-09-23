class Solution {
    public int search(int arr[], int x) {
        
        int temp = -1;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == x)
            {
                temp = i;
                break;
            }
        }
        return temp;
    }
}
