import java.util.*;
public class Encode {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int size = sc.nextInt();
        int sum=0;
        int count = 0;
        while(data>0){
            int r = data % 10;

            if(r==size){
                count++;
            }
            data/=10;
        }
        System.out.println(count);
    }
}
