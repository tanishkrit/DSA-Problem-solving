class Solution {
    ArrayList<Integer> findTwoElement(int arr[])
    {
        Arrays.sort(arr);

        int duplicate = 0;
        int missing = 0;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] == arr[i - 1])
            {
                duplicate = arr[i];
                break;
            }
        }

        int expected = 1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == expected)
            {
                expected++;
            }
        }

        missing = expected;

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(duplicate);
        ans.add(missing);

        return ans;
    }
}