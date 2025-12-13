package LeetcodeArrays;

public class BestTimetoBuyAndSell {

    public static void main(String[] args) {
        
        int[] arr = new int[] {7,1,5,3,6,4};

        BestTimetoBuyAndSell obj = new BestTimetoBuyAndSell();

        System.out.println(obj.maxProfit(arr));
    }

    private int maxProfit(int[] arr){

        int min = arr[0];
        int profit = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i] < min){
                min = arr[i];
            }
            else{
                profit = Math.max(profit , arr[i]-min);
            }
        }

        return profit;

    }
    
}
