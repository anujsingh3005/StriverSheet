public class SearchInsertPosition {
    public static int InsertPosfn(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = 0;

        while(low <= high){
            int mid = ((high + low)/2);
            
            if( target > nums[mid] ) {
                ans = mid+1;
                low = mid+1;
            }
            else high = mid - 1;
            
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] nums = {3,5,8,9,15,19};
        int target = 9;

        int k = InsertPosfn(nums, target);
        System.out.println(k);
    }
}
