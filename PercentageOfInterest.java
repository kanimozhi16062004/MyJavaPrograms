import java.util.Scanner;
public class PercentageOfInterest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Gender");
        String a = sc.nextLine();
        System.out.println("Enter the age");
        int b = sc.nextInt();
        if(a.equals("Female") || a.equals("female")){
            if(b>=1&&b<=58){
                System.out.println("Interest:8.2%");
            } else if (b>=59 && b<=100) {
                System.out.println("Interest:9.2%");
            }
        } else if (a.equals("Male") || a.equals("male")) {
                if(b>=1&&b<=58){
                    System.out.println("Interest:8.4%");
                } else if (b>=59 && b<=100) {
                    System.out.println("Interest:10.5%");
                }
            }

        }
    }

