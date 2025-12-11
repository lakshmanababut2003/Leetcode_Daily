import java.util.Arrays;

public class FinalPriceWithDisShop {

    public static void main(String[] args) {
        
        int[] arr = new int[] {10,1,1,6};

        int i=0 , j=i+1;

        int len = arr.length;

        while(i < len){

            if(j<len && i< j && arr[i] >= arr[j] ){
                arr[i] = arr[i]-arr[j];
            }
            else if(j < len && arr[j] > arr[i]){
                j++;
                continue;
            }

            i++;
            j=i+1;
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
