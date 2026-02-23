public class NthRootOfN {
    public static void main(String[] args) {
        int n=5, m=32;

        long result = NthRootOfNFn(n,m);

        System.out.println(result);
    }

    public static long NthRootOfNFn(int n, int m){
        int low=1,high=m;

        while(low<=high){
            int mid = low + (high-low)/2;

            long ans = 1;
            for (int i = 0; i < n; i++) {
                ans *= mid;
                if (ans > m) break;
            }
            if(ans == m) return mid;

            else if(ans < m) low=mid+1;
            else high=mid-1;
        }

        return -1;
    }
}
