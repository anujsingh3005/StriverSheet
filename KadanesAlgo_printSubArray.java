public class KadanesAlgo_printSubArray {
    public static void main(String[] args) {
        int[] nums={2, 3, 5, -2, 7, -4};
        int[] k = maxSubArray(nums);

        System.out.println("Start Index: " + k[0] + ", End Index: " + k[1]);
    }
    public static int[] maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int maxsum = 0;

        int start=0;
        int startans = 0;
        int endans = 0;
        
        for(int i=0; i<nums.length; i++){
            maxsum += nums[i];
            if(maxsum > sum) {
                sum = maxsum;
                startans = start;
                endans=i;
            }
            if(maxsum < 0) {
                maxsum = 0;
                start = i+1;
            }
        }
        return new int[]{startans,endans};
    }
}
