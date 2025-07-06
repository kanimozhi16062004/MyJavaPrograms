import java.util.*;
public class OddEvenOnlineGame {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if(p[i]%2==0){
                System.out.print(p[i]+" ");
            }
        }
        for(int i=0; i<n;i++){
            if(p[i]%2!=0){
                System.out.print(p[i]+" ");
            }
        }
    }
}
