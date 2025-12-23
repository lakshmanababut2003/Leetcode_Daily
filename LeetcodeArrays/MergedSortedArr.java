package LeetcodeArrays;

import java.util.Arrays;

public class MergedSortedArr {

    public static void main(String[] args) {
        
        int[] arr1 = new int[] {1 , 2, 3, 0 ,0 ,0};
        int[] arr2 = new int[] {2,4,5};

        int m =3, n =3;

        MergedSortedArr obj = new MergedSortedArr();

        obj.makeSortedArr(arr1, arr2, m, n);
    }

    private void makeSortedArr(int[] arr1 , int[] arr2 , int m , int n){

        for(int i=m , j=0;i<arr1.length;i++){
            arr1[i] = arr2[j++];
        }

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));
    } 
    
}
