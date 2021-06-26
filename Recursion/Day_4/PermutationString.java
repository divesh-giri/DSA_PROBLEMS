package Recursion.Day_4;

import java.util.ArrayList;

public class PermutationString {
    public static ArrayList<String> permuatationString(String str)
    {
        if(str.length()==1)
        {
            ArrayList<String> lastElement = new ArrayList<>();
            lastElement.add(str);
            return lastElement;
        }
        char cc  = str.charAt(0);
        String rc = str.substring(1);
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> temp = permuatationString(rc);
        for(String s: temp)
        {
            int i=0;
            while(i<=s.length())
            {
                StringBuilder sb = new StringBuilder(s);
                result.add(sb.insert(i,cc).toString());
                i+=1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(permuatationString(str));
    }
}
