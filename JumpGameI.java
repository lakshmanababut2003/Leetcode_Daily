public class JumpGameI {

    public static void main(String[] args) {
        
        int[] arr = new int[] {3,2,1,0,4};

        int len = arr.length;
        int farthest = 0 , end =0;
        boolean isReached = true;

        for(int i=0;i<len-1;i++){

            farthest = Math.max(farthest , i+arr[i]);

            if(i == end){

                if(farthest == end){
                    isReached = false;
                    break;
                }

                end = farthest;

            }
        }

        System.out.println(isReached);
    }
    
}
