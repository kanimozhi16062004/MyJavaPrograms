import java.util.Scanner;
public class TargetNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();
        int a[]=new int[b];
        for(int i=0;i<b;i++) {
            a[i] = sc.nextInt();
        }
        int target= sc.nextInt();
        boolean index = false;
        for(int i=0;i<b;i++){
            if(a[i]==target){
                System.out.println(i);
                index=true;
            }
        }
        if(!index){
            System.out.println(-1);
        }
    }
}
