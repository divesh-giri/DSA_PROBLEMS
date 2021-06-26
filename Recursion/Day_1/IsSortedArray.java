package Recursion.Day_1;

public class IsSortedArray
{
    public static boolean isArraySorted(int []arr,int n,int m)
    {
        if(arr.length==1)
            return true;
        if(arr[n]>arr[m])
            return false;
        if(m==arr.length-1)
            return true;
        

        return isArraySorted(arr, n+1, m+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 9, 99, 100};
        System.out.println(isArraySorted(arr, 0, 1));

    }
}