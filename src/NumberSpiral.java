import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSpiral {
    //https://cses.fi/problemset/task/1071
    public static void main(String[] args) {
        // 704012672 608536365;
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<Long> x = new ArrayList<>(); //столбцы
        List<Long> y = new ArrayList<>(); //строки
        for (int i = 0; i < t; i++) {
            y.add(scanner.nextLong());
            x.add(scanner.nextLong());
        }

        StringBuilder resStr = new StringBuilder("");
        long value = 0;
        for (int i = 0; i < t; i++) {
            if (x.get(i) >= y.get(i) && x.get(i) % 2 == 1) {
                value = (x.get(i) * x.get(i) + 1) - y.get(i);
            }

            if (x.get(i) >= y.get(i) && x.get(i) % 2 == 0) {
                value = (x.get(i) - 1) * (x.get(i) - 1) + y.get(i);
            }

            if (x.get(i) <= y.get(i) && y.get(i) % 2 == 1) {
                value = (y.get(i) - 1) * (y.get(i) - 1) + x.get(i);
            }

            if (x.get(i) <= y.get(i) && y.get(i) % 2 == 0) {
                value = (y.get(i) * y.get(i) + 1) - x.get(i);
            }
            resStr.append(value);
            resStr.append('\n');
        }
        System.out.println(resStr);
    }
}
