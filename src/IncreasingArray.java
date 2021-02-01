import java.util.Scanner;

public class IncreasingArray {
    //https://cses.fi/problemset/task/1094
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        long moveNum = 0L;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                moveNum += array[i] - array[i + 1];
                array[i + 1] += array[i] - array[i + 1];
            }
        }

        System.out.println(moveNum);
        //  6 8 2 1 8 3 3
    }
}
