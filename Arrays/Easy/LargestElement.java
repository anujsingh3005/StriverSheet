import java.util.*;
class LargestElement {
    public static void main(String[] args){
        int [] nums = {-4, -3, 0, 1, -8};
        int number = largestElement(nums);
        System.out.println(number);
    }

    public static int largestElement(int[] nums) {
    Arrays.sort(nums);
    int len = nums.length;
    return nums[len-1];
    }
}