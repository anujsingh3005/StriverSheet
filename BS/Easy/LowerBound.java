public class LowerBound {
    public static int LowerBoundfn(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = ((high + low)/2);
            
            if( target <= nums[mid] ) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid+1;
            
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] nums = {1,2,2,3};
        int target = 2;

        int k = LowerBoundfn(nums, target);
        System.out.println(k);
    }
    
}
