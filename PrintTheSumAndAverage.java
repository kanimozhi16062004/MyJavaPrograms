public class PrintTheSumAndAverage {
    public  static  void main(String args []){
        int a[]={1,3,6,7,8};
        int sum = 0;
        int avg = 0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
        avg=sum/a.length;
        System.out.println(avg);
    }
}
