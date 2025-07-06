import java.util.Scanner;
public class EnergyInScienceLab {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a*b*c;
        System.out.print(a);
        System.out.print(" " +a*b);
        System.out.print(" "+d);
    }
}
