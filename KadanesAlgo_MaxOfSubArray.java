public class KadanesAlgo_MaxOfSubArray {
    public static void main(String[] args) {
        int[] nums={-2, -3, -7, -2, -10, -4};
        int k = maxSubArray(nums);
        System.out.println(k);
    }
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        
        for(int i=0; i<nums.length-1; i++){
            int maxsum=nums[i];
            for(int j=i+1; j<nums.length; j++){
                maxsum = maxsum +nums[j];
                if(maxsum > sum) sum = maxsum;
                if(maxsum < 0) maxsum = 0;
            }
        }
        return sum;
    }
}
