import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    
    static ArrayList<Integer> leaders(int arr[], int n) {
        int max_ele = arr[n-1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(max_ele);
        for(int i = n-2; i>=0;i--)
        {
            if(arr[i]>=max_ele)
            {
                list.add(arr[i]);
                max_ele = arr[i];
            }
        }
        
        Collections.reverse(list);

        return list;
    }
    public static void main(String[] args) {
        int[] ar = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> arr = leaders(ar, 6);
        for(int item: arr)
        {
            System.out.println(item);
        }
    }
}
