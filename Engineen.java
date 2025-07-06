import java.util.Scanner;

public class Engineen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("Temperature reading invalid");
        } else if (a >= 0 && a <= 69) {
            System.out.println("Engine cold. Allow engine to warm up");
        } else if (a >= 70 && a <= 100) {
            System.out.println("Engine temperature normal.");
        } else if (a >= 101 && a <= 120) {
            System.out.println("Engine heating up. Monitor closely");
        } else if (a >= 121 && a <= 150) {
            System.out.println("Engine overheating! Stop and check");
        } else if (a >= 151 && a <= 200) {
            System.out.println("Potential engine fire risk");
        } else {
            System.out.println("Invalid Input.");
        }
    }
}
