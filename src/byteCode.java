import java.lang.reflect.Array;
import java.util.Arrays;

public class byteCode {

    public int calculate(String s) {
        int len = s.length();
        int x=1;
        int y=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='A')
                x=2*x+y;
            else
                y=2*y+x;
        }
        return x+y;

    }

    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int len = drinks.length;
        int len2 = staple.length;
        int count=0;
        for(int i=0;i<len2;i++){
            if(staple[i]>x||staple[i]+drinks[0]>x||staple[i]+drinks[len-1]<x)
                break;
            for(int j=len-1;j>=0;j--){
                if(staple[i]+drinks[j]<=x){
                    count=count+j+1;
                    count = (int) (count%(1e9 + 7));
                    break;

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
