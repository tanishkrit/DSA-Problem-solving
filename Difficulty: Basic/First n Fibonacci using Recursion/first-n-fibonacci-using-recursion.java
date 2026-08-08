class Solution {
    
    public static int[] fibonacciNumbers(int n) 
    {
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = fib(i);
        }
        
        return arr;
    }
    
    static int fib(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        
        return fib(n - 1) + fib(n - 2);
    }
}