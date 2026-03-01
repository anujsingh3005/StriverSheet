public class ArrangeCin {
    public static int arrangeCoins(int n) {
        long low = 1, high=(n/2)+1;
        while(low<=high){
            long mid = low + (high-low)/2;
            long req = (mid * (mid + 1))/2;
            if(req == (long)n) return (int) mid;
            else if(req<=(long)n) low=mid+1;
            else high=mid-1;
        }
        return (int)high;

    }
    public static void main(String[] args) {
        int n = 6;
        int ans = arrangeCoins(n);
        System.out.println(ans);
    }
}
