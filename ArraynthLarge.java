import java.util.Scanner;
public class ArraynthLarge{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int a[]=new int[size];
        for (int i= 0;i <size;i++){
            a[i]=sc.nextInt();
        }
        int n= sc.nextInt();
        int Max= a[0];
        for (int i= 1; i <size; i++){
            if (a[i]> Max) {
                Max= a[i];
            }
        }
        for(int j=2; j<=n; j++){
            int nmax=a[0];
            for (int i=0; i<size; i++){
                if (a[i]< Max) {
                    nmax=a[i];
                    break;
                }
            }
            for (int i = 0; i < size; i++){
                if (a[i]<Max && a[i]>nmax){
                    nmax= a[i];
                }
            }

            Max=nmax;
        }
        System.out.println(Max);
    }
}
