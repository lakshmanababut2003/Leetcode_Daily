

public class MaximumSumSubArray {

    public static void main(String[] args){

       int[] arr = new int[] {5,4,-1,7,8};

       int max = Integer.MIN_VALUE;

       int res = subArray(arr, 0, 0 , max);

       System.out.println("Answer : " + res);


    }

    private static int subArray(int [] arr , int start , int end , int max){

        int sum =0;
        for(int i=start ; i <=end ;i++){
            sum+=arr[i];
        }
   
        max = Math.max(max , sum);

        if(end != arr.length-1){
            end++;
            return subArray(arr, start, end , max);
        }
        else if(end == start){
            return max;
        }
        else if(end == arr.length-1){
            start++;
            return subArray(arr, start, start , max);
        }
        else{
            return max;
        }

        

    }
    
}
