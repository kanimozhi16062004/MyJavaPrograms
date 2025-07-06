import java.util.Scanner;

public class NumCraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int t1 = num1 / 1000;
        int h1 = (num1 / 100) % 10;
        int te1 = (num1 / 10) % 10;
        int u1 = num1 % 10;
        int t2 = num2 / 1000;
        int h2 = (num2 / 100) % 10;
        int te2 = (num2 / 10) % 10;
        int u2 = num2 % 10;
        int t3 = num3 / 1000;
        int h3 = (num3 / 100) % 10;
        int te3 = (num3 / 10) % 10;
        int u3 = num3 % 10;
        int minT = 9;
        if(minT > t1){
            minT = t1;
        }
        if(minT > t2){
            minT = t2;
        }
        if(minT > t3){
            minT = t3;
        }

        int minTe = 9;
        if(minTe > te1){
            minTe = te1;
        }
        if(minTe > te2){
            minTe = te2;
        }
        if(minTe > te3){
            minTe = te3;
        }
        int maxH = 0;
        if(maxH < h1){
            maxH = h1;
        }
        if(maxH < h2){
            maxH = h2;
        }
        if(maxH < h3){
            maxH = h3;
        }

        int maxU = 0;
        if(maxU < u1){
            maxU = u1;
        }
        if(maxU < u2){
            maxU = u2;
        }
        if(maxU < u3){
            maxU = u3;
        }
        System.out.println("" + minT + maxH + minTe + maxU);
    }
}
