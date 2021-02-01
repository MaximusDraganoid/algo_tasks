import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrayCode {
    static int n = 0;
    static List<Integer> list = new ArrayList<>(); //n == 1

    public static void main(String[] args) {
        list.add(0);
        list.add(1);
        //System.out.println(Integer.toBinaryString(192));
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        search(1);
    }

    public static void search(int k) {
        if (k == n) {
            StringBuilder result = new StringBuilder("");
            for (int i = 0; i < list.size(); i++) {
                StringBuilder toAdd = new StringBuilder(Integer.toBinaryString(list.get(i)));
                if (toAdd.length() < n) {
                    int len = toAdd.length();
                    for (int j = 0; j < n - len; j++) {
                        toAdd.insert(0, '0');
                    }
                }
                result.append(toAdd);
                result.append('\n');
            }
            System.out.println(result);
            return;
        }

        int addToEndOfList = (int)Math.pow(2, k);
        int len = list.size();
        for (int i = 0; i < len; i++) {
            list.add(list.get(len - 1 - i) + addToEndOfList);
        }
        search(k + 1);
    }
}
