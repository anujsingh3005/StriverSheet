import java.util.HashMap;

public class NoOfSubarrayWithCountK {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int k = 3;
        int ans = subarraySum(nums, k);
        System.out.println(ans);
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;

        HashMap<Integer,Integer> prefixMap = new HashMap<>();

        prefixMap.put(0,1);

        int prefixSum = 0;

        for(int i=0; i<nums.length; i++){
            prefixSum +=nums[i];

            int remove = prefixSum - k;

            if(prefixMap.containsKey(remove)){
                count += prefixMap.get(remove);
            }
            prefixMap.put(prefixSum ,prefixMap.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}
