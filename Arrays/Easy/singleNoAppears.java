
public class singleNoAppears {
    public static void main(String[] args){
        int [] nums = {5};
        int number = singleNumber(nums);
        System.out.println(number);
    }

    public static int singleNumber(int[] nums) {
        int xor = nums[0];
        for(int i=1; i<nums.length; i++){
            xor ^= nums[i];
        }
        return xor;
    }
}
