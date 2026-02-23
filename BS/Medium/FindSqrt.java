public class FindSqrt {
    public static void main(String[] args) {
        int nums = 28;

        int result = floorSqrt(nums);

        System.out.println(result);
    }

    public static int floorSqrt(int n) {
      int ans = -1, low=1, high=n/2;

       if (n < 2) return n;

      while(low<=high){
        int mid = low + (high-low)/2;
        int prod = mid*mid;
        if(prod <= n){
            ans = mid;
            low=mid+1;
        }
        else high = mid -1;
      }

      return ans;
    }
}
