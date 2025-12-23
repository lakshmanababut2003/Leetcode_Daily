package LeetcodeArrays;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,1};

        NextPermutation obj = new NextPermutation();

        System.out.println(Arrays.toString(obj.nextPermutation(arr)));
    }

    private int[] nextPermutation(int[] arr){

        int len = arr.length;

        int i=len-2;

        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }

        if(i >=0){

            int j = len-1;

            while(arr[j]<= arr[i]){
                j--;
            }

            swap(arr , i , j);

        }

        reverse(arr , i+1);

        return arr;

    }

    private void reverse(int[] arr , int start){

        int end = arr.length-1;

        while(start < end){
            swap(arr , start , end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr , int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
