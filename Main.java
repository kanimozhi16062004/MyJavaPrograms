//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        int a=1234;
                int temp=a;
                int r=0;
                int d;
                while(a!=0){
                    d=a%10;
                    a=a/10;
                    r=r*10+d;
                }
                System.out.println(r);
                if(temp==r){
                    System.out.println("palindrome");
                }
                else {
                    System.out.println("not a palindrome");
                }
        }
    }
