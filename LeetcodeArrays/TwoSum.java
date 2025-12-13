package LeetcodeArrays;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        
        int[] arr = new int[]{3,2,4};
        int target = 6;

        TwoSum obj = new TwoSum();

        System.out.println(Arrays.toString(obj.findTargetPos(arr, target)));
    }

    private int[] findTargetPos(int[] arr , int target){

         Map<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int remain = target - arr[i];

            if(!map.containsKey(remain)){
                map.put(arr[i] , i);
                continue;
            }

            return new int[] {map.get(remain) , i};

        }

        return new int[]{-1 , -1};

    }
    
}
