public class binarysearch 
{
    public static int BinarySearch(int nums[], int target)
    {
        int left =0;
        int right = nums.length - 1;


        while(left <= right)
        {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        return 0;
    }

    public static void main(String[] args)
    {
        int nums[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 21;

        int result = BinarySearch(nums, target);

        if(result != 0)
        {
            System.out.println("Element found at index: " + result);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
