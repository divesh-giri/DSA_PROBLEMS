import java.util.Scanner;

class MissingNumber{

    // Brute Force Method (T.C O(N.logN) S.C O(1))


//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int flag = 0;
//         int result = -1;
//         for(int i=0;i<nums.length;i++) {
//             if(nums[i]!=i) {
//                 flag = 1;
//                 result = i;
//                 break;
//             }
//         }
        
//         if(flag==0) {
//             result = nums.length;
//         }
//         return result;
//     }

// Hashing Array Technique (T.C O(N), S.C O(N))

    public static int missingNumber(int[] nums) {
        int[] nums2 = new int[10000];
        int result = -1;
        for(int i=0;i<nums.length;i++) {
            nums2[nums[i]] = -1; 
        }
        for(int i=0;i<nums2.length;i++) {
            if(nums2[i]!=-1) {
                result = i;
                break;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {0,1,4,5,2};
        System.out.println(missingNumber(nums));
        sc.close();
    }
}