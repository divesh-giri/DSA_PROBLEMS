public class ZeroAndOne {
    public static void main(String[] args) {
        // Two 
        int arr[] = {1, 0, 0, 1, 0, 1 ,0 ,0 , 1};
        int i = 0;
        int j = arr.length - 1;
        while(i<j)
        {
            while (arr[i] == 0 && i < j)
                i++;
 
            while (arr[i] == 1 && i < j)
                j--;
    
            if(i<j)
            {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }

        for(int m: arr)
        {
            System.out.print(m+ " ");
        }



    }
}
