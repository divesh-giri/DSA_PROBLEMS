public class ChangeInput {
    public static char[] changeInput(String str, char[] ch, int n, int m)
    {
        if(n>=str.length())
        {
            return ch;
        }
        if(n<str.length()-1 && str.charAt(n) == str.charAt(n+1))
        {
            ch[m] = str.charAt(n);
            ch[m+1] = '*';
            ch[m+2] = str.charAt(n+1);
            m += 2;
            n += 1; 
        }
        else
        {
            ch[m] = str.charAt(n);
        }
        return changeInput(str, ch, n+1, m+1);
    } 
    public static void main(String[] args) {
        String str = "xxyy";
        char[] ch = new char[str.length()*2];
        char[] chr = changeInput(str, ch, 0, 0);

        for(char c: chr)
        {
            System.out.print(c);
        }
    }
}
