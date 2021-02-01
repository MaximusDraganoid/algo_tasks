import java.util.Scanner;

public class TwoKnights {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int k = 1; k <= n; k++) {
            System.out.println(calc(k) / 2);
        }

    }

    public static long calc (int n) {
        return (long)n * n * (n * n - 1) - 4 * 2 - 8 * 3 - (n - 4) * 4 * 4 - 4 * 4 - (n - 4) * 4 * 6 - (n - 4) * (n - 4) * 8;
    }
}
