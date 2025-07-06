public class SumWithSkip {
    public static void main(String[] args) {
        int[] arr={10, 3, 6, 1, 2, 7, 9};
        int sum=0;

        for (int i=0;i<arr.length;i++) {
            if (arr[i]==6){
                i++;
                while (i<arr.length && arr[i]!= 7){
                    i++;
                }
            } else{
                sum+=arr[i];
            }
        }
        System.out.println("Sum: "+sum);
    }
}
