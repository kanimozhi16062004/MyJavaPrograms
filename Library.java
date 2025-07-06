import java.util.*;
public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        if (r == 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] returned = new int[r];
        boolean[] seen = new boolean[n + 1];
        boolean invalid = false;

        for (int i = 0; i < r; i++) {
            returned[i] = sc.nextInt();
            if (returned[i] < 1 || returned[i] > n) {
                invalid = true;
                break;
            }
            if (seen[returned[i]]) {
                invalid = true;
                break;
            }

            seen[returned[i]] = true;
        }

        if (invalid) {
            System.out.println("Invalid input");
            return;
        }

        boolean missing = false;

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                System.out.print(i + " ");
                missing = true;
            }
        }

        if (!missing) {
            System.out.println(0);
        }
    }
}
