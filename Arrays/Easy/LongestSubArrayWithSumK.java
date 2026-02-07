
public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6, 2, 9};
        int k = 15;
        int s = longestSubarray(nums, k);
        System.out.println(s);
    }

    public static int longestSubarray(int[] nums, int k) {
        int maxlen=0, left=0, right=0;
        long currentsum=0;
        int n = nums.length;

        while(right < n){
            currentsum += nums[right];

            while(left<=right && currentsum > k){
                currentsum -= nums[left];
                left++;
            }

            if(currentsum == k) maxlen = Math.max(maxlen, right - left + 1);

            right++;
        }
        return maxlen;
    }
}
