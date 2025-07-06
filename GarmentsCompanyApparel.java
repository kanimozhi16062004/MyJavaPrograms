import java.util.*;
public class GarmentsCompanyApparel {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        int count = 0;
        for(int i = 0; i < n;i++){
            a[i]=sc.nextInt();
int a2=(int)Math.sqrt(a[i]);
            if(a[i]==a2*a2){
                count++;
            }
        }
        System.out.println(count);
    }
}
