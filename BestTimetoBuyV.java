public class BestTimetoBuyV {

    public static void main(String[] args) {
        
        int[] arr = new int[] {12,16,19,19,8,1,19,13,9};

        int k = 3;

        State[] dp = new State[k+1];

        int fp = arr[0];

        for(int i=0;i<=k;i++){
            dp[i] = new State(-fp , fp , 0);
        }

        int n = arr.length;

        for(int i=0;i<n;i++){

            int currPrice = arr[i];

            for(int j =k ;j>0;j--){

                long prevProfit = dp[j-1].maxProfit;

                dp[j].maxProfit = Math.max(dp[j].maxProfit , Math.max(dp[j].buyHold + currPrice , dp[j].sellHold-currPrice));
                dp[j].buyHold = Math.max(dp[j].buyHold , prevProfit - currPrice);
                dp[j].sellHold = Math.max(dp[j].sellHold , prevProfit + currPrice);
            }
        }

        System.out.println(dp[k].maxProfit);
    }
    
}

class State{

    long buyHold , sellHold , maxProfit;

    public State(long b , long s , long m){
        this.buyHold = b;
        this.sellHold = s;
        this.maxProfit = m;
    }
}
