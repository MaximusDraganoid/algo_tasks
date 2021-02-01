import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DigitQueries {
    //внимательнее смотри за циферками
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        List<Long> list = new LinkedList<>();

        for (int i = 0; i < q; i++) {
            long buff = scanner.nextLong();
            list.add(buff);
        }


        for (int i = 0; i < q; i++) {

            int exp = 1;//число знаков
            long base = 1;
            long prevBorder = 0;
            long nextBorder = 0;
            long currentValue = list.get(i);
            //определяем число цифр в числе
            long startVal = 0;
            while (true) {
                prevBorder = nextBorder;
                nextBorder = 9 * base * exp + prevBorder;
                if (currentValue <= nextBorder) {
                    break;
                }
                base *= 10;
                exp++;

            }

            //определяем число
            //нахоим между какиеми числами лежит число
            long startV = 1;
            long endV = 0;
            base = 1;
            for (int j = 0; j < exp; j++) {
                startV = endV;
                endV = 9 * base + startV;
                base *= 10;
            }

            long shiftInNum = (currentValue - prevBorder) % exp;
            long shift;
            if (shiftInNum == 0) {
                shift = (currentValue - prevBorder) / exp;
                shiftInNum = (currentValue - prevBorder - 1) % exp;
            }
            else {
                shift = (currentValue - prevBorder) / exp + 1;
                shiftInNum -= 1;
            }

            long res = shift + startV;
            //System.out.println(res);
            //System.out.println(shiftInNum);
            System.out.println(String.valueOf(res).charAt((int)shiftInNum));


        }
    }
}
