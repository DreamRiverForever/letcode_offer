public class climbStairs {
    public static int climbStairs(int n) {
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        int step = climbStairs(n-1)+climbStairs(n-2);
        return step;


    }
    //可以看出菲波那切数列d[i]=d[i-1]+d[i-2],d[1]=1,d[2]=2;
    public int mendth(int n){
        if(n<=2){
            return n;
        }
        int i1 = 1;
        int i2 = 2;
        for(int i=3;i<=n;i++){
            int temp = i1+i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
}
