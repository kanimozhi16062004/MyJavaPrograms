import java.util.Scanner;
public class OnlineGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = 1;
        int count = 0;
        for(int i=1;i<=a;i++){
            fact=i*fact;
        }
        while(fact!=0){
            int r=fact%10;
            fact/=10;
            if(r==0){
                count++;
            }
            if(r!=0){
                break;
            }
        }
        System.out.println(count);
    }
}
