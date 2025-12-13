package LeetcodeArrays;

public class MaximumSubArraySum {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1};

        MaximumSubArraySum obj = new MaximumSubArraySum();

        System.out.println(obj.findMaxSum(arr));

    }

    private int findMaxSum(int[] arr){

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i] + sum < 0){
                sum =0;
                continue;
            }

            sum+=arr[i];
            maxSum = Math.max(sum , maxSum);
        }

         return maxSum;
    }

   


    
}
