public class LeftRotateByK {
    public static void main(String[] args) {
        int[] nums = {3, 4, 1, 5, 3, -5};
        int k = 8;
        rotateArray(nums, k);
    }
    public static void rotateArray(int[] nums, int k) {
        while(k>0){
            for(int i=1; i<nums.length; i++){
            int temp = 0;
            temp = nums[i-1];
            nums[i-1]=nums[i];
            nums[i]=temp;
        }
        k--;
        }
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
