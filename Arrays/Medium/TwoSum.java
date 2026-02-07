import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {1, 3, 5, -7, 6, -3};
        int target = 0;
        int[] ans = twoSum(nums,target);
        System.out.print( ans[0] + " " + ans[1]);
    }
    // public static int[] twoSum(int[] nums, int target) {
    //     for(int i = 0; i<nums.length-1; i++){
    //         for(int j = i + 1; j<nums.length; j++){
    //             if(nums[i] + nums[j] == target) return new int[]{i, j};
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complemet = target - nums[i];
            if(map.containsKey(complemet)) return new int[]{map.get(complemet), i};
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
