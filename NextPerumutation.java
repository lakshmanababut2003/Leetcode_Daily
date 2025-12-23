import java.util.Arrays;

public class NextPerumutation{

    public static void main(String[] args){

        int[] arr = new int[] {1,1};

        int n = arr.length;

        int i=n-2;

        while(i >=0 && arr[i] >= arr[i+1]){
            i--;
        }

        if(i>=0){

            int j=n-1;

            while(arr[j] <= arr[i]){
                j--;
            }

            swap(arr , i , j);
        }

        reverse(arr , i+1);

        System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr , int start){

        int end = arr.length-1;

        while(start < end ){

            swap(arr , start , end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr , int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}