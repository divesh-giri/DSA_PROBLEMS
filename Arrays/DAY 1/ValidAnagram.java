public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        
        int[] alpha_count = new int[26];
        
        for(int i = 0;i<s.length();i++) {
            alpha_count[s.charAt(i)-'a'] += 1;
            alpha_count[t.charAt(i)-'a'] -= 1;
        }
        
        for(int i = 0;i<alpha_count.length;i++) {
            if(alpha_count[i]!=0)
                return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
