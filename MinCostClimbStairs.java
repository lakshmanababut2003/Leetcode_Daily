public class MinCostClimbStairs {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,100,1,1,1,100,1,1,100,1};

        int n = arr.length;
        int first = arr[0];
        int second = arr[1];

        for(int i=2;i<n;i++){

            int curr = arr[i] + Math.min(first , second);
            first = second;
            second = curr;
        }

        System.out.println(Math.min(first , second));
    }
    
}
