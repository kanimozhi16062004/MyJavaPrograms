import java.util.*;
public class PooledCabServices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
            if (d >= s && d <= e) {
                System.out.print(d + " ");
            }
        }
    }
}
