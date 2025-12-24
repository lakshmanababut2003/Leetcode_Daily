public class CircularSubArrMaxSum {

    public static void main(String[] args) {
        
        int[] arr = new int[]{8, -8, 9, -9, 10, -11, 12};

        int currMax = arr[0] , maxSum = arr[0];
        int currMin = arr[0] , minSum = arr[0];
        int total = arr[0];

        for(int i=1;i<arr.length;i++){

            currMax = Math.max(currMax + arr[i] , arr[i]);
            maxSum = Math.max(currMax , maxSum);

            currMin = Math.min(currMin + arr[i] , arr[i]);
            minSum = Math.min(currMin , minSum);

            total+=arr[i];
        }

        int cirSum = total - minSum;

        if(cirSum < 0){
            System.out.println(maxSum);
            return;
        }

        System.out.println(Math.max(cirSum , maxSum));
    }
    
}
