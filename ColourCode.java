import java.util.Optional;
import java.util.Scanner;
public class ColourCode {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        switch (a){
            case 'r':
                System.out.println("Red");
                break;
            case 'b':
                System.out.println("blue");
                break;
            case'o':
                System.out.println("orange");
                break;
            case'y':
                System.out.println("yellow");
                break;
            case 'w':
                System.out.println("white");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
