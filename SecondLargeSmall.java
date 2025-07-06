import java.util.Arrays;

public class SecondLargeSmall {
    public static void main(String args []){
        int a[] = {3,8,5,4,7,2};
        Arrays.sort(a);
        int l= a.length-2;
        System.out.println(a[1]);
        System.out.println(a[l]);
    }
}
