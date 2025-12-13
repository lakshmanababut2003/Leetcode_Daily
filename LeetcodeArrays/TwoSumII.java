package LeetcodeArrays;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
        
        int[] arr = new int[]{-1,0};
        int target = 1;

        TwoSumII obj = new TwoSumII();

        System.out.println(Arrays.toString(obj.findMatch(arr, target)));
    }

    private int[] findMatch(int[] arr , int target){

        int left = 0 , right = arr.length-1;
        int[] res = new int[2];

        while(left < right){

            
            int sum = arr[left] + arr[right];

            if(sum == target){
                res[0] = left+1;
                res[1] = right+1;
            }

            if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }

        return res;
    }
    
}
