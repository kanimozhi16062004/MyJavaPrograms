import java.util.Scanner;
public class GiftHampersToWinners {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int[] ar = new int[a];
        int count = 0;
        for(int i = 0; i < a; i++) {
            ar[i] = sc.nextInt();
        }
        for(int i = 0; i < a; i++) {
            for(int j = i + 1; j < a; j++) {
                if(ar[i] + ar[j] >= d) {
                    count++;
                }
            }
        }

        System.out.println(count-1);
    }
}
