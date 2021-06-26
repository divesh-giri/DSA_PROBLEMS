package Recursion.Day_3;

public class ATOI {
    public static int alphaToString(String str)
    {
        if(str.length()==1)
            return str.charAt(str.length()-1) - '0';
        
        int temp = str.charAt(str.length()-1)-'0';
        return alphaToString(str.substring(0, str.length()-1))*10 + temp;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(alphaToString(str));
    }
}
