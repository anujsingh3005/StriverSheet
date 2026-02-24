public class bloomDay {
    public static int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int mid = -1;
        int n = bloomDay.length;

        if(n < ((long) m*k)) return -1;

       for(int item : bloomDay){
            if(item > max) max=item;
            if(item < min) min=item;
       } 
       while(min <= max){
        mid = (min+max) / 2;

        boolean ans = check(bloomDay, m, k, mid);

        if(ans) max = mid-1;
        else min = mid+1;
       }
       return min;
    }
    public static boolean check(int [] nums, int m, int k, int days){
        int counter = 0;
        int bouquet=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= days) {
                counter++;
                if(counter == k){
                    bouquet+=1; 
                    counter=0;
                } 
            }
            else counter=0;
        }
        if(bouquet >= m) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int result = minDays(bloomDays, k, m);
        if (result == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + result);
    }
}
