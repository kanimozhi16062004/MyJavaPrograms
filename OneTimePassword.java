import java.util.*;

public class OneTimePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        int count = 0;

        for (int i = 0; i < m.length(); i++) {
            char ch = m.charAt(i);
            int ascii = (int) ch;

            if (ascii == 32 || !( (ascii >= 48 && ascii <= 57) || (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) )
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
