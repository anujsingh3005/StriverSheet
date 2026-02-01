public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 6};
        rotateArrayByOne(nums);
    }
    public static void rotateArrayByOne(int[] nums) {

        for(int i=1; i<nums.length; i++){
            int temp=nums[i-1];
            nums[i-1]=nums[i];
            nums[i]=temp;
        }
        
        for(int i=0; i<nums.length; i++){
            System.out.print(" "+ nums[i] +" ");
        }
    }
}
