import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ChessboardAndQueens {
    static boolean[] column = new boolean[8];
    static boolean[] diag1 = new boolean[15];
    static boolean[] diag2 = new boolean[15];
    static int count = 0;
    static List<String> input;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            column[i] = false;
        }

        for (int i = 0; i < 15; i++) {
            diag1[i] = false;
            diag2[i] = false;
        }

        input = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            input.add(scanner.nextLine());
        }

        search(0);
        System.out.println(count);

    }

    static void search(int y) {
        if (y == 8) {
            count++;
            return;
        }
        for (int x = 0; x < 8; x++) {
            if (column[x] || diag1[x + y] || diag2[y - x  + 8 - 1]) continue;
            if (input.get(y).charAt(x) == '*') continue;
            column[x] = diag1[x + y] = diag2[y - x  + 8 - 1] = true;
            search(y + 1);
            column[x] = diag1[x + y] = diag2[y - x  + 8 - 1] = false;
        }
    }
}
