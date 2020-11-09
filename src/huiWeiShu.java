import java.util.ArrayList;

public class huiWeiShu {

    public static void main(String[] args) {

        System.out.println(isPalindrome(11));


    }
    /*判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

    示例 1:

    输入: 121
    输出: true
    示例 2:

    输入: -121
    输出: false
    解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
    示例 3:

    输入: 10
    输出: false
    解释: 从右向左读, 为 01 。因此它不是一个回文数。*/

    public static boolean isPalindrome(int x) {
        int num = 0;
        int temp = x;
        if (x < 0 ){
            return false;
        }
       while (x != 0){
           num = x%10 + num*10;
           x = x/10;

       }
       if (num == temp){
           return true;
       }else {
           return false;
       }


    }
}
