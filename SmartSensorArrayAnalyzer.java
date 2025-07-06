import java.util.Scanner;
public class SmartSensorArrayAnalyzer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        int mode=sc.nextInt();
        int sum = 0;
        for(int i = 0;i<a;i++){
            int count=0;
            if(i>=2){
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
            }
            if(mode==1){
                if(count==2){
                    sum=sum+b[i];
                }
            }
            else if(mode==2){
                if(count!=2){
                    sum=sum+b[i];
                }
            }
        }
        System.out.println(sum);
    }
}
