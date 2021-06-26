package Recursion.Day_1;

public class PiValue {
    public static char[] piValue(String str, char[] ch, int n, int m)
    {
        if(m==str.length())
            return ch;
        if(str.charAt(m)=='p')
        {
            ch[n] = '3';
            ch[n+1] = '.';
            ch[n+2] = '1';
            ch[n+3] = '4';
            n += 3;
            m += 1;
        }
        else
        {
            ch[n] = str.charAt(m);
        }
        return piValue(str, ch, n+1, m+1);

    }
    public static void main(String[] args) {
        String str="2*pi+3*pi++10*pi";
        char ch[] = new char[str.length()*2];
        char chr[] = piValue(str, ch, 0, 0);
        for(char c: chr)
        {
            System.out.print(c);
        }
    }
}
