import java.util.Scanner;

public class TrailingZeros {
    //https://cses.fi/problemset/task/1618
    /*
        число нулей в факториале == числу, сколько раз умножили на 5.
        Однако, есть числа, которые увеличивают число нулей сразу на 2, 3, 4 и т.д. - это соответственно 25 (5^2),
        125 (5^3) и т.д. Поэтому, чтобы их учесть, необходимо так же поделить на 25, на 125 и т.д. и учесть их в
        общей сумме. Максимальная степень определяется как log (n) по основанию 5, т.е. мы ищем максимальную степеньЮ
        в которую нужно возвести 5, чтобы она была меньше n. 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int log_n_5 = (int)(Math.log(n) / Math.log(5));
        int res = 0;
        int mnog = 5;
        for (int i = 1; i <= log_n_5; i++) {
            res += n / mnog;
            mnog *= 5;
        }

        System.out.println(res);
    }
}
