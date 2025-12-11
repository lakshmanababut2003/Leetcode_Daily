import java.util.Arrays;

public class NextGreaterEle {

    public static void main(String[] args) {
        
        int[] arr1 = new int[] {2,4};
        int[] arr2 = new int[] {1,2,3,4};

        int[] res = new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    res[i] = findNextMax(arr2, j);
                }
            }
        }

        System.out.println(Arrays.toString(res));
    }

    private static int findNextMax(int[] arr, int start){

        int max = arr[start];

        for(int i=start;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                break;
            }
        }

        return max != arr[start] ? max : -1;
    }
    
}
