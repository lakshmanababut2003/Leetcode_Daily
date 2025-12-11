public class TrappingWaterI {

    public static void main(String[] args) {
        
        int[] arr = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};

        int len = arr.length;

        int l =0 , r=len-1;
        int leftMax =0 , rightMax=0;
        int total=0;

        while(l < r){

            if(arr[l] < arr[r]){

                if(leftMax < arr[l]){
                    leftMax = arr[l];
                }

                total+= leftMax - arr[l];
                l++;
            }
            else{

                if(rightMax < arr[r]){
                    rightMax = arr[r];
                }

                total+=rightMax-arr[r];
                r--;
            }
        }

        System.out.println(total);
    }
    
}
