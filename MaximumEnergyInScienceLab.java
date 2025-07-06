import java.util.Arrays;
import java.util.Scanner;
public class MaximumEnergyInScienceLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        int d = b.length;
        int max = b[d - 1] + b[d - 2];
        System.out.println(max);
    }
}
