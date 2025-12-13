package LeetcodeArrays;

import java.util.HashSet;

// 0(n^2) - brute force
// 0(n log n) -( sort) - better  

public class ContainDuplicate {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3,1};

       ContainDuplicate obj = new ContainDuplicate();

       System.out.println(obj.isContain(arr));


    }

    private boolean isContain(int[] arr){

         HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){

            if(set.contains(arr[i])){
                return true;
            }

            set.add(arr[i]);
        }

        return false;
    }
    
}
