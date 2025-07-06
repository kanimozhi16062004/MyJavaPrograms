import java.util.Scanner;
public class BucketizeId {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        while(a != 0){
            int r = a % 10;
            if(r > max){
                max = r;
            }
            a /= 10;
        }
        System.out.println(max);
    }
}
