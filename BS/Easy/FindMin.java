public class FindMin {

    public static void main(String[] args) {
        int [] nums = {3,4,5,0,2};
        int ans = findMin(nums);
        System.out.println(ans);
    }
    public static int findMin(int[] nums) {
    
      int low = 0, high=nums.length-1;

      while(low < high){
        int mid = low + (high-low)/2;

        if(nums[high] < nums[mid]){
            low = mid+1;
        }else high = mid;
      }  
      return nums[low];
    }    
}