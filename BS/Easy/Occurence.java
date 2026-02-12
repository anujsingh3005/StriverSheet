
public class Occurence {
    public static int Occurencefn(int[] nums, int target) {

        int s = starting(nums, target);
        int e = ending(nums, target);

        return e-s+1;
    }


    public static int starting(int[] nums, int target){
        int ans = -1;
        
        int low=0 , high=nums.length-1;

        while(low<=high){
            int mid = (low+high) / 2;

            if(target == nums[mid]){
                ans= mid;
                high=mid-1;
            }else if(target > nums[mid]) low = mid+1;
            else high = mid - 1;
        }
        
        return ans;
    }

    public static int ending(int[] nums,  int target){
        int ans = -1;
        
        int low=0, high=nums.length-1;

        while(low<=high){
            int mid = (low+high) / 2;

            if(target == nums[mid]){
                ans= mid;
                low=mid+1;
            }else if(target > nums[mid]) low = mid+1;
            else high = mid - 1;
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 2, 2, 3};
        int target = 2;

        int ans = Occurencefn(nums, target);

        System.out.println(ans);
    }
}
