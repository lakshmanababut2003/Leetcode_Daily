public class GasStation {

    public static void main(String[] args) {
        
        int[] gas = new int[] {2,3,4};
        int[] cost = new int[] {3,4,3};

        int totalGas = 0;

        for(int i=0;i<gas.length;i++){
            totalGas += gas[i] - cost[i];
        }

        if(totalGas < 0){
            System.out.println(-1);
            return;
        }

        int startInd = 0;
        int remaining =0;

        for(int i=0;i<gas.length;i++){

            remaining = (gas[i] + remaining) - cost[i];

            if(remaining < 0){
                startInd = i+1;
                remaining = 0;
            }
        }

        System.out.println(startInd);
    }
    
}
