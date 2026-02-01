public class SecondLargestElement {
    public static int secondLargestElement(int[] nums) {
        int len = nums.length;
        int max= 0;
        for(int i=0; i<len; i++){
            if(nums[i]>max) max = nums[i];
        }
        int newmax=-1;
        for(int i=0; i<len; i++){
            if(nums[i]!=max && nums[i]>newmax) newmax=nums[i];
        }
        return newmax;
    }
    public static void main(String[] args) {
        int[] nums = {7, 7, 2, 2, 10, 10, 10};
        int n = secondLargestElement(nums);
        System.out.println(n);
    }
}
