import java.util.Scanner;

public class FlipSumChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int opt = scanner.nextInt();

        int result;
        if (N % 2 == 0)
            result = N / 2;
        else
            result = (N + 1) / 2;

        System.out.println(result);

    }
}
