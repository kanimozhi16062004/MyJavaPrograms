import java.util.Scanner;
public class DrillPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int d = 1; d <= N; d++) {
            int m = (d % 2 == 1) ? 3 : 4;
            for (int i = 1; i <= d; i++) {
                System.out.print(m * i);
                if (i != d)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}