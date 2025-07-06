import java.util.Scanner;
public class SecretCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        int[] digitCount = new int[10];
        while (d > 0) {
            int digit = d % 10;
            digitCount[digit]++;
            d /= 10;
        }

        int s = 0;
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 1) {
                s++;
            }
        }
        if (s == 0) {
            System.out.println("-1");
        } else {
            System.out.println(s);
        }
    }
}
