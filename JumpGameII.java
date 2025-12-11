public class JumpGameII {

    public static void main(String[] args) {
        
        int[] arr = new int[] {2,3,1,1,4};

        int farthest = 0 ,end =0 , jump =0;
        int len = arr.length;

        for(int i=0;i<len-1;i++){

            farthest = Math.max(farthest, i+arr[i]);

            if(i == end ){

                if(farthest == end){
                    jump = -1;
                    break;
                }

                jump++;
                end = farthest;
            }
        }

        System.out.println(jump);
    }
    
}
