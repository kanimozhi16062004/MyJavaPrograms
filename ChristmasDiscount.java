import java.util.Scanner;

public class ChristmasDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();

        int o = 0;
        int e = 0;

        while (bill > 0) {
            int digit = bill % 10;
            if (digit % 2 == 0) {
                e += digit;
            } else {
                o += digit;
            }
            bill /= 10;
        }

        int d = o * e;
        System.out.println(d);
    }
}
