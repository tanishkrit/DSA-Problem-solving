class Solution {
    public double findMedian(int[] arr) 
    {
        Arrays.sort(arr);
        int x = arr.length;
        int b= ((arr.length / 2)+1);
        int y = 0;
        int z = 0;
        double a = 0;
        
        // for(int i =0; i < arr.length; i++)
        // {
                
        // }
        if(arr.length%2 == 0)
        {
            y = arr[x/2];
            z = arr[(x-1)/2];
            a = (y+z)/2.0;
        
            return a;
        }
        else
        {
            return arr[x/2];
        }

    }
}
