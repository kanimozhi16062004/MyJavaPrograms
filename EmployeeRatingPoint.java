import java.util.Scanner;
public class EmployeeRatingPoint {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=30 && a<=50){
            System.out.println("D");
        } else if (a>=51 && a<=60) {
            System.out.println("C");

        }
        else if (a>=61 && a<=80) {
            System.out.println("B");

        }
        else if (a>=81 && a<=100) {
            System.out.println("A");

        }
    }
}
