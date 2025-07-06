import java.util.Scanner;
import java.util.Arrays;
public class Lowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int a = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            a += c[i];
            if (a < min) {
                min = a;
            }
        }
        System.out.println(min);
    }
}
