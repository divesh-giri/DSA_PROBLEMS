package DynamicProgramming.Day_2;

public class LongestCommonSubsequence {

    // Recursion
    public static int lcs(String s1, String s2)
    {
        int count = 0;
        if(s1.length()==0 || s2.length()==0)
            return 0;
        if(s1.charAt(0) == s2.charAt(0))
        {
            count = 1 + lcs(s1.substring(1), s2.substring(1));
        }
        else
        {
           int r1 = lcs(s1.substring(1), s2);
           int r2 =  lcs(s1, s2.substring(1));
           count = r1>r2?r1:r2;
        
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(lcs("abcdgh","aedfhr"));
    }
}
