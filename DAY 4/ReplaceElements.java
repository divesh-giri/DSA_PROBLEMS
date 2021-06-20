public class ReplaceElements{
    public static int[] replaceElements(int[] arr) {
        int nums[] = new int[arr.length];
        nums[nums.length-1] = -1;
        int max = -1;
        for(int i=nums.length-2;i>=0;i--)
        {   
            
            if(arr[i+1]>max)
                max = arr[i+1];
            nums[i] = max;
        }
        return nums;
        
    }
    public static void main(String[] args) {
        int arr[] = {17, 18, 5, 4, 6, 1};
        int nums[] = replaceElements(arr);
        for(int n: nums)
        {
            System.out.print(n +" ");
        }
    }
}