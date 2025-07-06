import java.util.Scanner;
public class triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = scanner.nextDouble();
        double h1 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double h2 = scanner.nextDouble();
        double a1 = (b1 * h1) / 2.0;
        double a2 = (b2 * h2) / 2.0;
        double maxArea = Math.max(a1, a2);
        System.out.printf("%.2f%n", maxArea);
    }
}
