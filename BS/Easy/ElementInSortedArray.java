public class ElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid = -1;
        
        while(low <= high){
            mid = (high + low)/2;
            if(target > nums[mid]) low = mid+1;
            else if(target < nums[mid]) high = mid-1;
            else break;
        }

        int s = starting(nums, mid, target);
        int e = ending(nums, mid, target);

        return new int[]{s,e};
    }


    public static int starting(int[] nums, int occ, int target){
        int ans = -1;
        
        if(occ == -1) return -1;
        else if(occ == 0 && nums[occ] == target) return 0;
        
        for(int i=occ; i>=0; i--){
            if(nums[i] == target) ans=i;
        }
        return ans;
    }

    public static int ending(int[] nums, int occ, int target){
        int ans = -1;
        if(occ == -1) return -1;
        else if(occ == (nums.length - 1) && nums[occ] == target) return occ;
        for(int i=occ; i<nums.length; i++){
            if(nums[i] == target) ans=i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = searchRange(nums, target);

        System.out.println(ans[0] + " "+ ans[1]);
    }
}



// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = findFirst(nums,target);
//         int last = findLast(nums,target);
//         return new int[]{first,last};
//     }
//     public int findFirst(int[] nums, int target){
//         int low = 0, high = nums.length -1;
//         int ans = -1;
//         while(low<=high){
//             int mid = low+(high-low)/2;
//             if(nums[mid]==target){
//                 ans = mid;
//                 high = mid - 1;
//             }else if(nums[mid]<target){
//                 low = mid+1;
//             }else{
//                 high = mid -1;
//             }
//         }
//         return ans;
//     }
//     public int findLast(int[] nums, int target){
//         int low = 0, high = nums.length -1;
//         int ans = -1;
//         while(low<=high){
//             int mid = low+(high-low)/2;
//             if(nums[mid]==target){
//                 ans = mid;
//                 low = mid + 1;
//             }else if(nums[mid]<target){
//                 low = mid+1;
//             }else{
//                 high = mid -1;
//             }

//         }
//         return ans;
//     }
// }