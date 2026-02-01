import java.util.ArrayList;
import java.util.Arrays;

public class checkIfArrayIsSorted {

    public static boolean isSorted(ArrayList<Integer> nums) {
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) > nums.get(i+1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
       ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 1, 4, 5)); 
       System.out.println(isSorted(nums));
    }
}
