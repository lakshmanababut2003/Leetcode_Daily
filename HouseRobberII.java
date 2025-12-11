public class HouseRobberII {

    public static void main(String[] args) {
        
        int[] arr = new int[] {2,3,2};

        int len =arr.length;

        System.out.println(Math.max(getMax(arr, 0, len-2) , getMax(arr, 1, len-1)));
    }

    private static int getMax(int[] arr , int start , int end){

        int prevRob  =0 , maxRob =0;

        for(int i=start ;i<=end ;i++){

            int temp = Math.max(maxRob , prevRob+arr[i]);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
    }
    
}
