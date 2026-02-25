public class CapacityToCarryPackage {
    public static int shipWithinDays(int[] weights, int days) {
        int high=0, low=weights[0];
        int ans=0;

        for(int items: weights) {
            high+=items;
        }

        while(low<=high){
            int mid = (low+high)/2;
            boolean possible = check(weights, days, mid);
            if(possible){
                ans=mid;
                high=mid-1;
            }else low = mid+1;
        }
        return ans;
    }
    public static boolean check(int[] nums, int days, int mid){
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            sum += nums[i];
            if(days <= 0) return false;
            if(sum > mid){
                sum = 0;
                i--;
                days--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int ans = shipWithinDays(nums, days);
        System.out.println(ans);
    }

}



    