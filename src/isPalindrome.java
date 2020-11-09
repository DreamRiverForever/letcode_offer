public class isPalindrome {

    public static boolean isPalindrome(String s) {
        if (s.length()<=1)
            return true;
        int begin = 0;
        int end = s.length()-1;
        while (begin<end){
            while (begin<end&&!Character.isLetterOrDigit(s.charAt(begin)))
                begin++;
            while (end>begin&&!Character.isLetterOrDigit(s.charAt(end)))
                end--;
            if (begin>end||Character.toLowerCase(s.charAt(begin))!=Character.toLowerCase(s.charAt(end)))
                return false;
            begin++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
