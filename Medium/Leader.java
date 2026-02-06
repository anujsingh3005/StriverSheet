

import java.util.*;
public class Leader {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        int[] nums = {10, 22, 12, 3, 0, 6};

        list = leaders(nums);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
    }
    public static List<Integer> leaders(int[] nums) {
        List<Integer> list = new LinkedList<>();
        int max=Integer.MIN_VALUE;

        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] > max){
                max = nums[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }

}
