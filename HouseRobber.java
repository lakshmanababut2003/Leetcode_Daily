public class HouseRobber {

    public static void main(String[] args) {
        
        int[] arr = new int[] {2,1,1,2};

        int len = arr.length;

        System.out.println(getMax(arr, 0, len-1));
    
    }

    private static int getMax(int[] arr , int start , int end){

        int prevRob =0 ,  maxRob =0;

        for(int i=0;i<=end;i++){

            int temp = Math.max(maxRob , prevRob+arr[i]);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
    }
    
}
