package Recursion.Day_2;

import java.util.ArrayList;

public class PermutationOfString {

    public static ArrayList<String> compute(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        char cc = str.charAt(0);
        String rc = str.substring(1);
        ArrayList<String> temp = compute(rc);
        ArrayList<String> result = new ArrayList<>();
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
        ArrayList<String> list = compute("abc");
       System.out.println(list);
    }
}
