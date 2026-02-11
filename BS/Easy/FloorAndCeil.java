public class FloorAndCeil {

    public static int[] FloorAndCeilfn(int[] nums, int target) {
        int f = floor(nums, target);
        int c = ceil(nums, target);

        return new int[]{nums[f],nums[c]};
    }

    public static int floor(int[] nums, int k){
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = (high + low) / 2;

            if(k >= nums[mid]){
                ans = mid;
                low = mid + 1;
            }else high = mid - 1;
        }
        return ans;
    }

    public static int ceil(int[] nums, int k){
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = (high + low) / 2;

            if(k <= nums[mid]){
                ans = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {3, 4, 4, 7, 8, 10};
        int target = 5;

        int[] k = FloorAndCeilfn(nums, target);
        System.out.println(k[0] + " " + k[1]);
    }
    
    
}