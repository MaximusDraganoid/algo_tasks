
import java.util.*;

public class AppleDivision {
    static long sum = 0;
    static int n = 0;
    static long min = 2147483647;
    static boolean check[];
    static List<Integer> list;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        check = new boolean[n];
        for (int i = 0; i < n; i++) {
            check[i] = false;
        }

        list = new LinkedList<>();
        int buff = 0;
        for (int i = 0; i < n; i++) {
            buff = scanner.nextInt();
            list.add(buff);
            sum += buff;
        }
        List<Integer> l = new LinkedList<>();
        search(l, 0);
        System.out.println(min);
    }

    static void search(List <Integer> list, int k) {
        if (k == n) {

            long sum1 = sum;
            for (int i = 0; i < list.size(); i++) {
                sum1 -= AppleDivision.list.get(list.get(i));
            }

            long sum2 = sum - sum1;
            long currDiff = Math.abs(sum2 - sum1);
            if (currDiff < min) {
                min = currDiff;
            }
            return;
        }
        search(list, k + 1);
        list.add(k);
        search(list, k + 1);
        list.remove(list.size() - 1);
    }
}
