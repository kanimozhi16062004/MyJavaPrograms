import java.util.Scanner;
public class SalesReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] sales = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sales[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
            int max = sales[i][0];
            for (int j = 1; j < N; j++) {
                if (sales[i][j] > max) {
                    max = sales[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
