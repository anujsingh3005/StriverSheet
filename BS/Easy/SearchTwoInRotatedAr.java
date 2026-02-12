public class SearchTwoInRotatedAr {

    public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high=n-1;
        
        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target) return true;

            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }
            
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }else low = mid + 1;
            }
            
            else{
                if(target <= nums[high] && target > nums[mid]){
                    low = mid +1;
                }else high = mid - 1;
            }
        }
    return false;
    } 
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        int target = 0;

        boolean result = search(nums, target);

        System.out.println(result);
    }
}
