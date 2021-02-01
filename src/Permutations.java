import java.util.Scanner;

public class Permutations {
    //https://cses.fi/problemset/task/1070
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 2 || n == 3)
            System.out.println("NO SOLUTION");
        else {
            StringBuilder resultString = new StringBuilder("");
            Integer bufN = 2;
            while (bufN <= n) {
                resultString.append(bufN);
                resultString.append(' ');
                bufN += 2;
            }
            bufN = 1;
            while (bufN <= n) {
                resultString.append(bufN);
                resultString.append(' ');
                bufN += 2;
            }
            System.out.println(resultString);
        }
    }
}
