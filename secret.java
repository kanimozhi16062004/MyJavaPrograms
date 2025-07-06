import java.util.Scanner;
public class secret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int g = sc.nextInt();
            if (g < c) {
                System.out.println("Code too low, recalibrate!");
            } else if (g > c) {
                System.out.println("Code too high, recalibrate!");
            } else {
                System.out.println("Code cracked! You’ve saved the ship");
            }
        }
        System.out.println("Mission failed. The correct code was " );
    }
}
