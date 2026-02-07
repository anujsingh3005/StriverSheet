public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 6};
        rotateArrayByOne(nums);
    }
    public static void rotateArrayByOne(int[] nums) {
    if (nums == null || nums.length <= 1) return;

    // 1. Store the first element
    int first = nums[0];

    // 2. Shift all elements to the left by one
    for (int i = 1; i < nums.length; i++) {
        nums[i - 1] = nums[i];
    }

    // 3. Place the first element at the last index
    nums[nums.length - 1] = first;

    // Print result
    for (int num : nums) {
        System.out.print(num + " ");
    }
}
}
