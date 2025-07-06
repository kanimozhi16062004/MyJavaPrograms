import java.util.Scanner;
import java.util.Arrays;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        int max = 0;
        for (int i = 1; i < n; i++) {
            int d = p[i] - p[i - 1];
            if (d > max) {
                max = d;
            }
        }
        System.out.println(max);
    }
}
