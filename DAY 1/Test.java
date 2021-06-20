public class Test {
    public static boolean canJump(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int temp = nums[i];
            if(i<nums.length-1 && temp==0)
                return false;
            while(temp>0)
            {
                temp--;
                i++;
            }
        }
        return true;
    }
   public static void main(String[] args) {
       //int nums[] = {2, 3, 1, 1, 4};
       int nums[] = {2, 0, 0};
        System.out.println(canJump(nums));            
    }
}
