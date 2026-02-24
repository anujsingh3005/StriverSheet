

public class FindSmallestDivisor {
   
    public static int smallestDivisor(int[] nums, int threshold) {
        int min = 1;
        int max = 0;
        int mid = -1;

       for(int item : nums){
            max = Math.max(item, max);
       }

       while(min <= max){
            mid = (min + max)/2;

            int ans = check(nums, mid);
            if(ans <= threshold) {
                max = mid-1;
            }
            else min= mid+1;
       } 
       return min;
    }
    public static int check(int[] nums, int mid){
        int sum = 0;
        for(int items: nums){
            //made code optimal !!!!!
            sum += (items + mid - 1)/mid;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int k = 6;
        int result = smallestDivisor(nums, k);
        System.out.println(result);
    }
 
}
