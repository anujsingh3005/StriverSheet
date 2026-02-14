

public class FindPeak {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4};


        int k = findPeakElement(nums);
        System.out.println(k);
    }    
    public static int findPeakElement(int[] nums) {
        int low = 0, high=nums.length-1;

        while(low<high){
            int mid = (high + low) / 2;

            if(nums[mid] > nums[mid+1]){
                high = mid;
            }
            else low = mid + 1;
        }
        return low;
    }
}
