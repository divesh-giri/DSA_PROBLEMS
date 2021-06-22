public class TwoRepeatedElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 3};
        int nums[] = new int[arr.length];
        int abc[] = new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[arr[i]]==1)
            {
                abc[j++] = arr[i];
                if(j==2)
                    break;
            }
            nums[arr[i]]++;
        }
        System.out.println(abc[0]+" "+abc[1]);

    }
}
