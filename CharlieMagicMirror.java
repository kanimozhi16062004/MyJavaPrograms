import java.util.Scanner;

public class CharlieMagicMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        if (word1.length() != word2.length()) {
            System.out.println("-1");
            return;
        }
        String c = word1 + word1;
        if (c.contains(word2)) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}
