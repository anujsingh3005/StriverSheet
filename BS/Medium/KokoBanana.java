import java.util.*;

public class KokoBanana {
    private static int calculateTotalHours(int[] piles, int speed) {
        int totalH = 0;
        for (int bananas : piles) {
            totalH += (int)Math.ceil((double)bananas / speed);
        }
        return totalH;
    }
    public static int minEatingSpeed(int[] piles, int h) {
    
        int maxPile = Arrays.stream(piles).max().getAsInt();

        int low = 1, high = maxPile;
        int ans = maxPile;

        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(piles, mid);

            if (totalH <= h) {
                ans = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println(minEatingSpeed(piles, h));
    }
}



