public class addBinary {

    public static String addBinary(String a, String b) {
        boolean isover = false;
        StringBuilder builder = new StringBuilder();
        int len1 = a.length();
        int len2 = b.length();
        int i =len1-1;
        int j = len2-1;
        char c1;
        char c2;
        for (;i>=0||j>=0;i--,j--){
            if (i<0)
                c1 = '0';
            else
                c1 = a.charAt(i);
            if (j<0)
                c2 = '0';
            else
                c2 = b.charAt(j);
            if (c1=='1'&&c2=='1') {
                if (isover){
                    builder.insert(0,'1');
                }
                else {
                    builder.insert(0,'0');
                    isover = true;
                }
            }
            else if (c1=='1'||c2=='1'){
                if (isover)
                    builder.insert(0,'0');
                else {
                    builder.insert(0,'1');
                }
            }
            else {
                if (isover){
                    builder.insert(0,'1');
                    isover = false;
                }
                else {
                    builder.insert(0,'0');
                }
            }
        }
        if (isover)
            builder.insert(0,'1');
         return builder.toString();
    }

    public static void main(String[] args) {
        String a = "1";
        String b = "111";
        System.out.println(addBinary(a,b));
    }
}
