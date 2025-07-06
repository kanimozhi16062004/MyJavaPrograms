import java.util.Scanner;
public class ArrayRotation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int c=sc.nextInt();
        if(c>a || c<0){
            System.out.println("invalid");
        }
        else {
            for (int i = 0; i < a; i++) {
                b[i] = sc.nextInt();
            }
            for (int j = 0; j < c; j++) {
                int first = b[0];
                for (int i = 0; i < a - 1; i++) {
                    b[i] = b[i + 1];
                }
                b[a - 1] = first;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

