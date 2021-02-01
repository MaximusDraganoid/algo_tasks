import java.util.Scanner;

public class TowerOfHanoi {

    //3 - 7, начинал с 3-го стака
    //4 - 15, начинал со 2-го
    public static int n = 0;
    public static StringBuilder result = new StringBuilder("");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Hanoi(0, 2, 1, n);
        System.out.println((int)Math.pow(2, n) - 1);
        System.out.println(result);

    }

    //from - откуда
    //to - куда
    //k - высота
    public static void Hanoi(int from, int to, int buff, int k) {
        if (k == 1) {
            result.append(from + 1);
            result.append(' ');
            result.append(to + 1);
            result.append('\n');
            return;
        }

        Hanoi(from, buff, to, k - 1);
        Hanoi(from, to, buff, 1);
        Hanoi(buff, to, from,k - 1);
    }

}
