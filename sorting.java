public class sorting {
    public static void main(String [] args){
        int ar[] = {6,2,8,9,5};
        for(int i=1;i<= ar.length-1;i++){
            for(int j=0;j<=i;j++){
                if (ar[j] > ar[i]) {
                    int temp=ar[j];
                    ar[j]=ar[i];
                    ar[i]=temp;
                }
            }
        }
        for(int i=0;i< ar.length;i++) {
            System.out.println(ar[i]);
        }
    }
}
