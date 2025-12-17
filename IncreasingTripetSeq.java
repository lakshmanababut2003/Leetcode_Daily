public class IncreasingTripetSeq {

    public static void main(String[] args) {
        
        int[] arr = new int[]{1,2,3,4,5};

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        boolean res = false;

        for(int ele : arr){

            if(ele <= a){
                a = ele;
            }
            else if(ele <= b){
                b = ele;
            }
            else{
                res = true;
                break;
            }
        }

        System.out.println(res);
    }
    
}
