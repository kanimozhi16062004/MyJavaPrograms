import java.util.Scanner;
public class NewYearDiscount {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while(a!=0){
            int r = a%10;
            a/=10;
            if(r%2==1){
                sum=sum+r;
            }
        }
        System.out.println(sum);
    }
}
