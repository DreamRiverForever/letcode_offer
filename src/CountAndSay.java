public class CountAndSay {
    public static void main(String[] args) {
        String s = countAndSay(5);
        System.out.println(s);
    }

    public static String countAndSay(int n) {
        if (n == 1)
            return "1";
        StringBuilder str = new StringBuilder();
        String temp = countAndSay(n-1);
        int j=0;
        int count=0;
        for (int i= 0;i<temp.length();){
            count=0;
            while (i<temp.length()&&(temp.charAt(j)==temp.charAt(i))){
                i++;
                count++;
            }
            str.append(count).append(temp.charAt(j));
            j = i;
        }
        return str.toString();

    }

}
