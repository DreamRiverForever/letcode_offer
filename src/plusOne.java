public class plusOne {

    public static int[] plusOne(int[] digits) {
        int len =digits.length;
        boolean isnine = true;
        for (int i=0;i<len;i++)
            if (digits[i]!=9)
                isnine = false;
        digits[len-1] += 1;

        if (!isnine){
            for (int i=len-1;i>=0;i--){
                if (digits[i]==10 && (i-1)>=0){
                    digits[i] = 0;
                    digits[i-1] += 1;
                }
            }
        }
        else{
            int[] a = new int[len+1];
            a[0]=1;
            for (int i=1;i<=len;i++)
                a[i] = 0;
            return a;
        }
        return digits;

    }
    //非常巧妙
    public int[] mentdh2(int[] digits){
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                break;
            }
        }
        int[] res;
        if (digits[0] == 0) {
            res = new int[length+1];
            res[0] = 1;
        } else return digits;
        return res;

    }

    public static void main(String[] args) {
        int[] a = {8,9,9};
        int[] n = plusOne(a);
        for (int i=0;i<n.length;i++)
            System.out.println(n[i]);
    }
}
