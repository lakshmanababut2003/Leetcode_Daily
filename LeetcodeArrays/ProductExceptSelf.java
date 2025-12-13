package LeetcodeArrays;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3,4};

        ProductExceptSelf obj = new ProductExceptSelf();
        System.out.println(Arrays.toString(obj.productExceptSelf(arr)));
    }

    private int[] productExceptSelf(int[] arr){

        int n = arr.length; 

        int[] res = new int[n];

        for(int i=0;i<n;i++){
            res[i] = 1;
        }

        int left = 1;

        for(int i=0;i<n;i++){
            res[i]*=left;
            left*=arr[i];
        }

        int rigth = 1;

        for(int i=n-1;i>=0;i--){
            res[i]*=rigth;
            rigth*=arr[i];
        }

        return res;
    }
    
}
