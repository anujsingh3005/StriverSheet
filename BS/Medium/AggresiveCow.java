import java.util.Arrays;

public class AggresiveCow{
    public static void main(String[] args) {
        int [] nums = {0,3,4,7,10,9};
        int k = 4;
        int ans = cowFn(nums, k);
        System.out.println(ans);
    }
    public static int cowFn(int[] nums, int k){
        Arrays.sort(nums);
        int maxOfMin = 0;
        int low = 1;
        int high = nums[nums.length-1] - nums[0];

        while(low<=high){
            int mid = low + (high-low)/2;
            boolean ans = check(nums, k, mid);
            if(ans){
                low = mid+1;
                maxOfMin=mid;
            }else high = mid - 1;
        }

        return maxOfMin;
    }
    public static boolean check(int [] nums, int k, int mid){
        int count=1;
        int lastpos = 0;
        for(int i=1; i<nums.length; i++){
            if((nums[i] - nums[lastpos]) >= mid){
               count++;
               lastpos=i; 
            }
            if(k==count) return true;
        }
        return false;
    }
}