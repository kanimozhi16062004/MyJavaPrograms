public class Sort {
    public static void main(String[] args) {
        int a[] = {8,5,9,3,7};
        int temp;
        for(int i = 0; i<a.length-1; i++) {
            for(int j = i+1; j<a.length;j++) {
                if(a[j]<a[i]) {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
