import java.util.Scanner;
public class TransmitData {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while (a>0){
            int r=a%10;
            a/=10;
            sum=(sum*10)+r;
        }
        System.out.println(sum);
    }
}
