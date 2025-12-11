public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] arr = new int[] {1,8,6,2,5,4,8,3,7};

        int len = arr.length;

        int l=0 , r=len-1;
        int max =0;

        while(l < r){

            int water = ((r-l) * Math.min(arr[l] , arr[r]));

            max = Math.max(max , water);

            if(arr[l] < arr[r]){
                l++;
            }
            else{
                r--;
            }
        }

        System.out.println(max);

    }
    
}
