public class SortByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int temp=0;
        while(i<j)
        {
            if(nums[i]%2==0)
            {
                i++;
            }
            else 
            {
                if(nums[j]%2==0)
                {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
                else
                {
                    j--;
                }
            }
        }
        
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {3, 1, 2, 4};
        int arr[] = sortArrayByParity(nums);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}
