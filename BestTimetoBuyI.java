public class BestTimetoBuyI {

    public static void main(String[] args) {
        
        int[] arr = new int[] {7,1,5,3,6,4};

        int max = Integer.MIN_VALUE;
        int buy = 0 , sell = 0 , profit = 0;

        while (buy < arr.length) {

            if(arr[sell] < arr[buy]){
                profit = arr[buy] - arr[sell];
                max = Math.max(profit , max);
            }
            else{
                sell = buy;
            }

            buy++;
            
        }

        System.out.println(max);
    }
    
}
