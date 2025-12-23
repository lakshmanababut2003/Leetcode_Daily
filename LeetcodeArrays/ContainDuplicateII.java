package LeetcodeArrays;

import java.util.*;

public class ContainDuplicateII {

    public static void main(String[] args) {
        
        int[] arr = new int[]{1,2,3,1,2,3};
        int k = 2;

        ContainDuplicateII obj = new ContainDuplicateII();

        System.out.println(obj.containDuplic(arr, k));

    }

    private boolean containDuplic(int[] arr , int k){

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){

            if(set.contains(arr[i])){
                return true;
            }

            set.add(arr[i]);

            if(set.size() > k){
                set.remove(arr[i-k]);
            }
        }

               return false;
    } 
    
}
