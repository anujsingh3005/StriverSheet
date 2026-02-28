public class GuessNumber {
    public static int guessNumber(int n) {
        int low = 1, high=n;
        while(low<=high){
            int mid = low + (high - low) / 2;
            int ans = guess(mid);
            if(ans==0) return mid;
            else if(ans==1) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public static int guess (int no){
        if(no > 6) return -1;
        else if( no < 6) return 1;
        else return 0;
    }
    public static void main(String[] args) {
       int ans =  guessNumber(10);        
       System.out.println(ans);
    }

}
