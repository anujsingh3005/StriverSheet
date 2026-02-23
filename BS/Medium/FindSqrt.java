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
        long mid = low + (high-low)/2;
        
        if(mid*mid <= n){
            ans = (int) mid;
            low= (int)mid+1;
        }
        else high = (int)mid -1;
      }

      return ans;
    }
}
