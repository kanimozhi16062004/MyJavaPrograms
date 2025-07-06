import java.util.Scanner;
public class InitializedDataType {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            System.out.println("Alphabhet");
        } else if (Character.isDigit(c)) {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special character");
        }
    }
}
