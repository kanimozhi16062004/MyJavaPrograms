public class MaximumAndMinimum {
    public static void main(String [] args){
        int a[]={1,2,3,4,5,6,7};
        int i=0;
        int min=a[i];
        int max=a[i];
        for(i=0;i< a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
        for(i=0;i< a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
