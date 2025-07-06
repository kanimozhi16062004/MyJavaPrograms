import java.util.*;
public class SumOfAdjacentDistance {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int a = n-1;
        int[] b = new int[a];
        int sum=0;
        for(int i = 0; i<a;i++){
            b[i]=p[i]-p[i+1];
            if(b[i]<0){
                b[i]=-b[i];
            }
            sum = sum+b[i];
        }
        System.out.println(sum);
    }
}
