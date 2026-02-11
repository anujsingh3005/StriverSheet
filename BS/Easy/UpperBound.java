public class UpperBound {
    
    public static int UpperBoundfn(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = ((high + low)/2);
            
            if( target < nums[mid] ) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid+1;
            
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] nums = {3,5,8,9,15,19};
        int target = 9;

        int k = UpperBoundfn(nums, target);
        System.out.println(k);
    }

}
