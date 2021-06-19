import java.util.Arrays;

public class PairSumCount {
    static int getPairsCount(int[] arr, int n, int k) {
        // Two pointer aproach
        // Arrays.sort(arr);
        // int count = 0;
        // int i = 0, j = n-1;
        // while(i<j)
        // {
        //     if((arr[i] + arr[j]) > k)
        //     {
        //         j--;
        //     }
        //     else if((arr[i] + arr[j]) < k)
        //     {
        //         i++;
        //     }
        //     else if((arr[i]+arr[j])==k)
        //     {
        //         count++; // Infinite loop
        //     }
        // }

        // Hashing Approach (Pair Sum Unique)
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        System.out.println(getPairsCount(arr, 4, 6));
    }
}
