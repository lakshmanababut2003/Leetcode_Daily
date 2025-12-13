package LeetcodeArrays;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        
        int[] arr = new int[]{0,0,0};  

        List<List<Integer>> res = new ArrayList<>();

        ThreeSum obj = new ThreeSum();

        Arrays.sort(arr);
        for(int i=0;i<arr.length && arr[i] <=0 ;i++){

            if(i==0 || arr[i] != arr[i-1]){
                obj.twoSum(arr , i , res);
            }
        }

        System.out.println(res);


    }

    private void twoSum(int[] arr , int i , List<List<Integer>> res){

        int left = i+1;
        int right = arr.length-1;
        int sum =0;

        while(left < right){

             sum = arr[i] + arr[left] + arr[right];

             if(sum < 0){
                left++;
             }
             else if(sum > 0){
                right--;
             }
             else{
                res.add(Arrays.asList(arr[i] , arr[left++] , arr[right--]));
                while(left < right && arr[left] == arr[left-1]){
                    ++left;
                }
             }
        }
    }
    
}
