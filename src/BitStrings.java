import java.util.Scanner;

public class BitStrings {
    //https://cses.fi/problemset/task/1617
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long result = 1;
        long mod = 1000000007L;
        for (int i = 0; i < n; i++) {
            result *= 2;
            result = Math.floorMod(result, mod);
        }

        System.out.println(result);

    }
}
