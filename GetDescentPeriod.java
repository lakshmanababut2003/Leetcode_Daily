public class GetDescentPeriod {

    public static void main(String[] args) {
        
        int[] arr = new int[] {3,2,1,4};

        int n = arr.length;

        int res = 1 , count =1;

        for(int i=1;i<n;i++){

            if(arr[i-1] - arr[i] == 1){
                count++;
            }
            else{
                count =1;
            }

            res+=count;
        }

        System.out.println(res);
    }
    
}
