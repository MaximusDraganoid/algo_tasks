import java.util.Scanner;

public class PalindromeReorder {
    //https://cses.fi/problemset/task/1755
    /*
    сначала мы проверяем, что у нас здесь действиетльно может быть полиндром, а затем восттанавливаем его
     */
    public static void main(String[] args) {
        Character A = 65;

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int alph[] = new int[26];
        for (int i = 0;i < 26; i++) {
            alph[i] = 0;
        }

        for (int i = 0; i < str.length(); i++) {
            alph[str.charAt(i) - 65]++;
        }
        int oneCount = 0;
        int middleElem = 0;
        for (int i = 0; i < 26; i++) {
            if (alph[i] % 2 == 1) {
                oneCount++;
                middleElem = i;
            }
        }
        if (oneCount > 1) {
            System.out.println("NO SOLUTION");
            return;
        }
        StringBuilder result = new StringBuilder(str.length());
        int start = 0, end = str.length() - 1;

        for (int i = 0; i < 26; i++) {
            int len = alph[i] / 2;
            if (len != 0) {
                for (int j = 0; j < len; j++) {
                    result.append((char)(i + A));
                }
            }
        }
        String res = result.toString();
        if (oneCount == 1) {
            res += Character.toString(A + middleElem);
        }
        res += result.reverse().toString();
        System.out.println(res);
    }
}
