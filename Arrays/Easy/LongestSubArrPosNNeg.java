import java.util.*;

public class LongestSubArrPosNNeg {
    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        int s = longestSubarray(nums, k);
        System.out.println(s); 
    }

    public static int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        int maxlen = 0;

        for(int i=0; i<nums.length; i++){
            prefix +=nums[i];

            if(prefix == k) maxlen = i+1;

            int rem = prefix - k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxlen = Math.max(maxlen, len);
            }

            if(!map.containsKey(prefix)) map.put(prefix, i);
        }
        return maxlen;
    }
}