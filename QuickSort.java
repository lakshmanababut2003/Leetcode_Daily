import java.util.Arrays;
import java.util.Random;

public class QuickSort {

   static Random random = new Random();

   public static void main(String[] args){

    int[] arr = new int[] {7,8,10,29,-45,2,66,10,23,-10};
    quickSort(arr , 0 , arr.length-1);
    System.out.println(Arrays.toString(arr));
   }

   private static void quickSort(int[] res , int l , int r){

    if(l >= r){
        return ;
    }

    int randomInd = l + random.nextInt(r-l+1);
    swap(res , l , randomInd);

    int pivot = res[l];

    int lt = l;
    int gt = r;
    int i = l+1;

    while(i <= gt){
        if(res[i] < pivot){
        // if(res[i] > pivot){ desc

            swap(res , lt , i);
            lt++;
            i++;
        }
        else if(res[i] > pivot){
        // else if(res[i] < pivot){ desc

            swap(res  , i , gt);
            gt--;
        }
        else{
            i++;
        }
    }

    quickSort(res , l , lt-1);
    quickSort(res , gt+1 , r);

   }

   private static void swap(int[] arr , int i , int j){

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
   }
    
}
