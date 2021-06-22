import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        // Hashing Approach
        int arr[] = {7, 8, 6, 5, 4, 2, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        int diff = 0;
        for(int i = 0;i<arr.length;i++)
        {
            diff = target - arr[i];
                if(map.get(diff) != null)
                {
                    System.out.println(map.get(diff)+" "+i);
                }
                else
                {
                    map.put(arr[i], i);
                } 
            
        }
    



    }
}
