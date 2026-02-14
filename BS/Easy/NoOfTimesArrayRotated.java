

public class NoOfTimesArrayRotated {
    public static void main(String[] args) {
        int [] nums = {5,6,7,0,1,2,3};
        int ans = NoOfTimesArrayRotatedfn(nums);
        System.out.println(ans);
    }

    public static int NoOfTimesArrayRotatedfn(int [] nums){
        int low=0, high=nums.length-1;

        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[high]) low = mid+1;
            else high=mid;
        }
        return low;
    }
    
}