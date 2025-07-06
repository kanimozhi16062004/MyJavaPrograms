import java.util.Scanner;
public class ChangeCase {
    public static void  main(String [] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(Character.isLowerCase(a)){
            System.out.println(Character.toUpperCase(a));
        }
        else {
            System.out.println(Character.toLowerCase(a));
        }
    }
}
