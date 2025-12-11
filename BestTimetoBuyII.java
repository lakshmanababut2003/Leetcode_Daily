public class BestTimetoBuyII {

    public static void main(String[] args) {
        
        int[] arr = new int[] {7,6,4,8,10};

        int sum = 0;

        for(int i=0;i<arr.length;i++){

            if(i+1 < arr.length && arr[i] < arr[i+1]){
                sum += arr[i+1] - arr[i];
            }
        }

        System.out.println(sum);


    }
    
}
