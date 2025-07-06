import java.util.Scanner;

public class MissingData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sent = sc.next();
        String rec = sc.next();
        int[] count = new int[256];
        for(char c : sent.toCharArray()) {
            count[c]++;
        }
        for(char c : rec.toCharArray()) {
            count[c]--;
        }
        for(int i = 0; i < 256; i++) {
            if(count[i] > 0) {
                System.out.println((char)i);
            }
        }
    }
}
