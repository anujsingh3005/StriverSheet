public class KadanesAlgo_MaxOfSubArray {
    public static void main(String[] args) {
        int[] nums={2, 3, 5, -2, 7, -4};
        int k = maxSubArray(nums);
        System.out.println(k);
    }
    public static int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int maxsum = 0;
        
        for(int i=0; i<nums.length; i++){
            maxsum += nums[i];
            if(maxsum > sum) sum = maxsum;
            if(maxsum < 0) maxsum = 0;
        }
        return sum;
    }
}
