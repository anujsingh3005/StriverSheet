
public class findMaxOccurence {
    public static void main(String[] args) {
        int [] nums = {1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        int k = findMaxConsecutiveOnes(nums);
        System.out.println(k);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0, newcount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) {
                newcount++;
                count = Math.max(count, newcount);
            }
            else newcount = 0;
        }
        return count;
    }
}
