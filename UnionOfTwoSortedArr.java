import java.util.*;

public class UnionOfTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 6, 7, 9, 9};
        int[] arr2 = {1, 5, 7, 8, 8};
        
        int[] ans = unionArray(arr1, arr2, arr1.length, arr2.length);

        for (int val : ans) {
            System.out.print(val + " ");
        }
    }

    public static int[] unionArray(int[] arr1, int[] arr2, int n, int m) {
        int i =0;
        int j=0;
        ArrayList<Integer> temp = new ArrayList<>();

        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                if(temp.isEmpty() || temp.get(temp.size() - 1) != arr1[i]){
                    temp.add(arr1[i]);
                }
                if(arr1[i] == arr2[j]) j++;
                i++;
            }
            else{
                if(temp.isEmpty() || temp.get(temp.size() - 1) != arr2[j]) temp.add(arr2[j]);
                j++;
            }  
        }
        while(i<n){
            if(temp.get(temp.size() - 1) != arr1[i]) temp.add(arr1[i]);
            i++;
        }
        while(j<m){
            if(temp.get(temp.size() - 1) != arr2[j]) temp.add(arr2[j]);
            j++;
        }

        int [] result = new int[temp.size()];
        for(int k=0; k< temp.size(); k++){
            result[k] = temp.get(k);
        }

       return result; 
    }
}
