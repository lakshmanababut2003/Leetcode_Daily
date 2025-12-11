public class MaximunSumSubArray2 {

    public static void main(String[] args) {
        
        int[] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        int sum =0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(sum + arr[i] < 0){
                sum = 0;
                continue;
            }
            else{
                sum += arr[i];
                max = Math.max(max, sum);
            }
        }

        System.out.println("Max Sum : " + max);
    }
    
}
