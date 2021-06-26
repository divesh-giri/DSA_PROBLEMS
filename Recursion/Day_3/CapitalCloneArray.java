package Recursion.Day_3;

public class CapitalCloneArray {
    public static String[] cloneArray(String[] arr, String[] cloneArr, int index)
    {
        if(arr.length == index)
            return cloneArr;
        String temp = arr[index].toUpperCase();
        cloneArr[index] = temp;
        String[] str = cloneArray(arr, cloneArr, index+1);
        return str;

        
    }
    public static void main(String[] args) {
        String[] arr = {"Amit", "Ram"};
        String[] cloneArr = new String[arr.length];
        String[] str = cloneArray(arr, cloneArr, 0);
        for(String s: str)
        {
            System.out.println(s);
        }
    }
}
