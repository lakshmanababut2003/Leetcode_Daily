public class MaximunSubArrayProd {

    public static void main(String[] args) {
        
        int[] arr = new int[]{-2, 6, -3, -10, 0, 2};

        int suffix = 1;
        int prefix = 1;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(prefix == 0){
                prefix = 1;
            }
            prefix = prefix * arr[i];
            max = Math.max(max , prefix);
        }

        for(int i=arr.length-1;i>=0;i--){
            if(suffix == 0){
                suffix = 1;
            }
            suffix = suffix * arr[i];
            max =Math.max(max , suffix);
        }

        System.out.println(max);
    }
    
}
