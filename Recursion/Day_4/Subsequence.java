package Recursion.Day_4;

import java.util.ArrayList;

public class Subsequence {
    
    public static ArrayList<String> subsequence(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        char cc = str.charAt(0);
        String rc = str.substring(1);
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> temp = subsequence(rc);
        for(String t: temp)
        {
            result.add(t);
            result.add(cc + t);
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = subsequence(str);
        System.out.println(list);
    }
}
