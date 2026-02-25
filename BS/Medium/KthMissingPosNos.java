public class KthMissingPosNos {
    public static void main(String[] args) {
        int [] nums = {4,7,9,10};
        int k = 2;
        int ans = find(nums, k);
        System.out.println(ans);
    }    
    public static int find(int[] nums, int k){
        int low = 0, high = nums.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            int missing = nums[mid] - (mid+1);

            if(missing < k) low=mid+1;
            else high = mid - 1;
        }

        return high + 1 + k;
    }
}
