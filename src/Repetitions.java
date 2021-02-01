import java.util.Scanner;

public class Repetitions {
    //https://cses.fi/problemset/task/1069
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxLen = 0, currentLen = 1;
        Character currentSymbol = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (currentSymbol.equals(input.charAt(i)))
                currentLen++;
            else {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;
                currentSymbol = input.charAt(i);
            }
        }
        maxLen = Math.max(maxLen, currentLen);
        System.out.println(maxLen);
    }
}
