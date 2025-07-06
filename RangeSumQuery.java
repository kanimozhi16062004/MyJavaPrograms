import java.util.Scanner;
public class RangeSumQuery {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=0 && b<=9999 && a<b){
            for(int i=a+1;i<=b;i++){
                a=a+i;
            }
            System.out.println(a);
        }
        else {
            System.out.println("Inavalid Input");
        }
    }
}
