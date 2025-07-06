import java.util.Scanner;

public class DigitalSecureDataTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        char c = (char)(a.charAt(0) + b);
        System.out.println(c);
    }
}
