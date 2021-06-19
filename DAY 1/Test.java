public class Test {
    public static void main(String[] args) {
        String str = "Leetcode";
        String pattern = "codes";

        char s,p;

        int flag = 0;

        int j=0;

        for(int i=0;i<str.length();i++)
        {
            s = str.charAt(i);
            p = pattern.charAt(0);

            if(s==p)
            {
                for(j=1;j<pattern.length();j++)
                {
                    i++;
                    if(i<str.length())
                    {
                        s = str.charAt(i);
                        p = pattern.charAt(j);

                        if(s != p)
                        {
                            flag = 0;
                            break;
                        }
                        flag = 1;
                    }
                    
                }
            }
            if(flag==1 && j==pattern.length())
            {
                System.out.println("Pattern Matched");
                break;
            }
        }
    }
}
