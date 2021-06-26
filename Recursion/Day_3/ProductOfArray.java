package Recursion.Day_3;

public class ProductOfArray {

    public static int product(int[] arr, int index) {
        if(index == arr.length-1)
            return arr[index];

        return arr[index]*product(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4};
        System.out.println(product(arr, 0));
    }
    
}
