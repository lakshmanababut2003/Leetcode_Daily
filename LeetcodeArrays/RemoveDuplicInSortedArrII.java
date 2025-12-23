package LeetcodeArrays;

public class RemoveDuplicInSortedArrII {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,1,1,2,2,3};

        RemoveDuplicInSortedArrII obj = new RemoveDuplicInSortedArrII();

        System.out.println(obj.findLength(arr));
        
        
    }

    private int findLength(int[] arr){

        int i=0;

        for(int val : arr){

            if(i < 2 || arr[i-2] != val){
                arr[i++] = val;
            }
        }

        return i;
    }
    
}
