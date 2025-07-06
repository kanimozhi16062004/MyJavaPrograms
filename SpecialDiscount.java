import java.util.Scanner;
public class SpecialDiscount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int ar[] = new int[a];
        int count = 0;
        for(int i = 0;i < a;i++){
            ar[i]=sc.nextInt();
            if(d % Math.abs(ar[i])%d==0){
                count++;
            }
        }
        System.out.println(count-1);
    }
}
