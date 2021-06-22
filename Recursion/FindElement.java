public class FindElement {
    public static boolean findElement(int[] arr,int ele,int n)
    {
        if(n==arr.length)
            return false;
        if(arr[n]==ele)
            return true;
        return findElement(arr, ele, n+1);
    }
    public static void main(String[] args) {
        int arr[] = {1000, 10, 20, 90, 2000, 120};
        int ele = 30;
        System.out.println(findElement(arr, ele,0)); 
    }
}
