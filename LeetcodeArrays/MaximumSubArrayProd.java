package LeetcodeArrays;

public class MaximumSubArrayProd {

    public static void main(String[] args) {
        
        int[] arr = new int[]{-2,0,-1};

        MaximumSubArrayProd obj = new MaximumSubArrayProd();

        System.out.println(obj.maxProduct(arr));
    }

    private int maxProduct(int[] arr){

        int suffix = 1 , prefix = 1 , maxProd = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(prefix == 0){
                prefix = 1;
            }
            prefix*=arr[i];
            maxProd = Math.max(prefix , maxProd);
        }

        for(int i=arr.length-1;i>=0;i--){
            if(suffix == 0){
                suffix = 1;
            }
            suffix*=arr[i];
            maxProd = Math.max(suffix , maxProd);
        }

        return maxProd;
    }
    
}
