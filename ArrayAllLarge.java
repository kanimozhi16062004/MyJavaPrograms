import java.util.Scanner;
public class ArrayAllLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        int max = b[0];
        for (int i = 1; i < a; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        int sec = max;
        for (int i = 0; i < a; i++) {
            if (b[i] != max) {
                sec = b[i];
                break;
            }
        }
        for (int i = 0; i < a; i++) {
            if (b[i] != max && b[i] > sec) {
                sec = b[i];
            }
        }
        int thi = max;
        for (int i = 0; i < a; i++) {
            if (b[i] != max && b[i] != sec) {
                thi = b[i];
                break;
            }
        }
        for (int i = 0; i < a; i++) {
            if (b[i] != max && b[i] != sec && b[i] > thi) {
                thi = b[i];
            }
        }
        int four = max;
        for (int i = 0; i < a; i++) {
            if (b[i] != max && b[i] != sec && b[i] != thi) {
                four = b[i];
                break;
            }
        }
        for (int i = 0; i < a; i++) {
            if (b[i] != max && b[i] != sec && b[i] != thi && b[i] > four) {
                four = b[i];
            }
        }
        int five = max;
        for (int i = 0; i < a; i++) {
            if (b[i] != max && b[i] != sec && b[i] != thi && b[i] != four) {
                five = b[i];
                break;
            }
        }
        for (int i = 0; i < a; i++) {
            if (b[i] != max && b[i] != sec && b[i] != thi && b[i] != four && b[i] > five) {
                five = b[i];
            }
        }
        System.out.println(max);
        System.out.println(sec);
        System.out.println(thi);
        System.out.println(four);
        System.out.println(five);
    }
}
