import java.util.Scanner;

public class TwoSets {
    //https://cses.fi/problemset/task/1092
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long commonSum = 0;
        for (int i = 1; i <= n; i++) {
            commonSum += i;
        }

        if (commonSum % 2 == 1) {
            System.out.println("NO");
            return;
        }
        commonSum /= 2;

        int maxElem = n;
        int secondSetCount = 0;

        while (commonSum - maxElem > 0) {
            commonSum -= maxElem;
            maxElem -= 1;
            secondSetCount += 1;
        }

        System.out.println("YES");
        System.out.println(secondSetCount + 1);
        //формируем второе множество
        StringBuilder secondSet = new StringBuilder("");
        secondSet.append(commonSum);
        secondSet.append(' ');

        for (int i = 0; i < secondSetCount; i++) {
            secondSet.append(maxElem + 1);
            secondSet.append(' ');
            maxElem += 1;
        }
        System.out.println(secondSet);
        StringBuilder firstSet = new StringBuilder("");
        //формируем первое множество
        for (int i = 1; i <= n - secondSetCount; i++) {
            if (i != commonSum) {
                firstSet.append(i);
                firstSet.append(' ');
            }
        }
        System.out.println(n -  secondSetCount - 1);
        System.out.println(firstSet);
    }
}
