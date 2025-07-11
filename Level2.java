public class Level2{
    public static int level(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if (nums[mid]==target)
                return mid;
            if (nums[mid]<target)
                left =mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr= {1,3,5,7,9};
        System.out.println(level(arr,2));
    }
}