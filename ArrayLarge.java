import java.util.Scanner;
public class ArrayLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[a];
        b[0] = sc.nextInt();
        int max = b[0];
        int min = b[0];
        for (int i = 1; i < a; i++) {
            b[i] = sc.nextInt();
            if (b[i] > max) {
                max = b[i];
            }
            if (b[i] < min) {
                min = b[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
        int d=max-min;
        System.out.println(d/2);
    }
}
