import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int sum = 0;
        while (a != 0) {
            int r = a % 10;
            sum = (sum * 10) + r;
            a /= 10;
        }
        if (temp == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

