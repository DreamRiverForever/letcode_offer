public class longString {
    /*编写一个函数来查找字符串数组中的最长公共前缀。
    如果不存在公共前缀，返回空字符串 ""。
    示例 1:

    输入: ["flower","flow","flight"]
    输出: "fl"
    示例 2:

    输入: ["dog","racecar","car"]
    输出: ""
    解释: 输入不存在公共前缀。*/


    // 这种方法称之为水平扫描法，首先让flower设置为result，然后开始和第二个字符比较，while循环从result末尾去除字符在比，
    // 直到str.indexof(result) == 0,说明字符串相等
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String result = strs[0];
        for (int i=0;i<strs.length;i++){
            //每个字符串开始result比较
            while(strs[i].indexOf(result) != 0){
                //末尾缩小result，查询最长前缀
                result = result.substring(0,result.length()-1);
                if (result.length() == 0)
                    return "";
            }
        }
        return result;

    }
    //暴力求解法
    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0)
            return "";
        String temp = strs[0];
        int index = -1;
        for (int i=1 ;i<strs.length;i++){
            index = -1;
            for (int j=0;j<strs[i].length();j++){
                if (j<temp.length() && temp.charAt(j) == strs[i].charAt(j))
                    index++;
                else
                    break;
            }
            if (index == -1)
                return "";
            else
                temp = temp.substring(0,index+1);

        }

        return temp;

    }

    public static void main(String[] args) {
        String[] str = {"aca","cba"};
        System.out.println(longestCommonPrefix2(str));
    }
}
