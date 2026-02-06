import java.util.HashSet;
import java.util.Set;

public class longestSeq {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6};
        int t = longestConsecutive(nums);
        System.out.println(t);
    }


    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int i=0; i<n; i++) set.add(nums[i]);

        int longest = 1;
        int count=0;

        if (n == 0) return 0;

        for(int it : set){
            if(!set.contains(it - 1)){
                count = 1;
                int x = it;

                while(set.contains(x + 1)){
                    count++;
                    x = x + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
