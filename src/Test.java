import java.lang.management.BufferPoolMXBean;
import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static String thousandSeparator(int n) {
        StringBuilder builder = new StringBuilder();
        if (n / 1000 == 0)
            return builder.append(n).toString();
        int temp = 0;
        int count = 0;
        while (n > 0) {
            temp = n % 10;
            count++;
            builder.insert(0, temp);
            if (count == 3 && n / 10 != 0) {
                builder.insert(0, '.');
                count = 0;
            }
            n = n / 10;

        }
        builder.reverse().toString();
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(thousandSeparator(0));
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        
    }



    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> list = new ArrayList<>();
        int[] a = new int[n];


        for (int j = 0; j < edges.size(); j++) {
            a[edges.get(j).get(1)]=1;
        }
        for (int i=0;i<n;i++)
            if (a[i]==0)
                list.add(i);
        return list;

    }

    
}
