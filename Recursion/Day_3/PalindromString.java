package Recursion.Day_3;

public class PalindromString {
    public static boolean palindrome(String str)
    {
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0)==str.charAt(str.length()-1))
        {
           boolean result = palindrome(str.substring(1, str.length()-1));
           return result; 
        }
        else
            return false;
    }
    public static void main(String[] args) {
        String str = "roor";
        System.out.println(palindrome(str));
    }
}
