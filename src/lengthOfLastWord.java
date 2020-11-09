public class lengthOfLastWord {
    //通过划分' '单词返回最后一个单词
    public static int lengthOfLastWord(String s) {
        if (s.length()==0)
            return 0;
        String[] str = s.split(" ");
        for (int i=0;i<str.length;i++)
            System.out.println(str[i]);
        if (str.length==0)
            return 0;
        else
            return str[str.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(mendth(" a "));
    }
    //从后面往前去除空格在统计单词个数
    public static int mendth(String s){
        if (s.length()==0)
            return 0;
        int len = s.length();
        int count=0;
        for (int i=len-1;i>=0;i--){
            if (s.charAt(i)==' ')
               continue;
            while (i>=0&&s.charAt(i)!=' '){
                count++;
                i--;
            }

            return count;
        }
        return count;
    }
}
