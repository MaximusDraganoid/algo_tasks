import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinPiles {
    //https://cses.fi/problemset/task/1754
    /*
    за один шаг можно убрать: или 1 монету слева и 2 справа (количество таких шагов обозначим за x)
                              или 2 монеты справа и 1 слева (количество таких шагов обозначим за y)
    тогда у нас получается следующая система :
    a = x + 2y
    b = 2x + y
    В нашем случае эта система должна быть разрешима в целых положительных числах
    выразим сначала отдельно x, затем y
    3x = 2a - b
    3y = 2b - a
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            a.add(scanner.nextInt());
            b.add(scanner.nextInt());
        }

        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < t; i++) {
            if ((((2 * a.get(i) - b.get(i)) > 0) && ((2 * a.get(i) - b.get(i)) % 3 == 0) &&
                    ((2 * b.get(i) - a.get(i)) > 0) && ((2 * b.get(i) - a.get(i)) % 3 == 0)) || (a.get(i) == b.get(i) && a.get(i) == 0)) {
                str.append("YES");
                str.append('\n');
            }
            else {
                str.append("NO");
                str.append('\n');
            }

        }
        System.out.println(str);
    }
}
