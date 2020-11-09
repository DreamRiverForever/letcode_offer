public class maxSubArray {
    //动态规划
    public static int maxSubArray(int[] nums) {

        int[] b = new int[nums.length];
        b[0] = nums[0];
        for (int i=1;i<nums.length;i++){
            if (b[i-1]>=0)
                b[i] = b[i-1]+nums[i];
            else
                b[i] = nums[i];

        }
        for (int i=0;i<b.length;i++)
            if (b[i]>b[0])
                b[0] = b[i];

        return b[0];

    }

    //分治法
    public static int fenzhifa(int[] nums, int l,int r){
        //边界，当就剩一个元素，最大子段和就是本身
        if (l==r)
            return nums[l];
        //划分
        int mid = (l+r)/2;
        //左侧最大子段和
        int maxl = fenzhifa(nums,l,mid);
        //右侧最大子段和
        int maxr = fenzhifa(nums,mid+1,r);
        //中间向两边扩散最大子段和
        int sum = 0;
        int maxmidl = nums[mid];
        int maxmidr = nums[mid+1];
        int i;
        for (i=mid;i>=l;i--){
            sum += nums[i];
            if (sum>maxmidl)
                maxmidl = sum;

        }

        sum = 0;
        for (i=mid+1;i<=r;i++){
            sum += nums[i];
            if (sum>maxmidr)
                maxmidr = sum;
        }

//        System.out.println(maxl);
//        System.out.println(maxr);
//        System.out.println(maxmidl+maxmidr);
        //返回三者中最大的值
        maxl = maxr>maxl?maxr:maxl;
        maxl = (maxmidl+maxmidr)>maxl?(maxmidl+maxmidr):maxl;
        return maxl;
    }

    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(fenzhifa(a,0,a.length-1));
    }
}
