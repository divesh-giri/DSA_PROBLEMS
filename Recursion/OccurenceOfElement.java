public class OccurenceOfElement {
    public static int elementOccurence(int []arr, int target, int count, int n)
    {
        if(n==arr.length)
            return count;
        if(arr[n]==target)
            count += 1;
        return elementOccurence(arr, target, count, n+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {1000, 10, 2000, 90, 2000, 120};
        int target = 2000;
        System.out.println(elementOccurence(arr, target, 0, 0));
    }
}
