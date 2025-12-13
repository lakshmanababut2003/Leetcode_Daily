package LeetcodeArrays;

import java.util.Arrays;

public class KRotatedSortedArr {

    public static void main(String[] args) {
        
        int[] arr = new int[]{1,2,3,4,5};

        int k=2;

        int r = k % arr.length;

        KRotatedSortedArr obj = new KRotatedSortedArr();

        obj.rotateArray(arr , 0 , arr.length-1);
        obj.rotateArray(arr , 0 , r-1);
        obj.rotateArray(arr , r , arr.length-1);


        System.out.println(Arrays.toString(arr));

    }

    private void rotateArray(int[] arr , int i , int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
}
