package LeetcodeArrays;

public class RemoveDuplicInSortedArr {

    public static void main(String[] args) {
        
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};

        RemoveDuplicInSortedArr obj = new RemoveDuplicInSortedArr();

        int end = obj.remDuplc(arr);

        for(int i=0;i<end;i++){
            System.out.print(arr[i] + " ");
        }

    }

    private int remDuplc(int[] arr){

        int pos =1;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i] != arr[i+1]){
                arr[pos++] = arr[i+1];
            }
        }

        return pos;
    }
    
}
