import java.util.Random;

public class FirstMissingPositiveNum {

    static Random random = new Random();

    public static void main(String[] args) {
        
        int[] arr = new int[] {
            -1,-2,0,0,1,1,3
        };

        sort(arr , 0 , arr.length-1);

         int startInd = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i] <= 0){
                startInd++;
                continue;
            }

            break;
        }

        int target = 1;

        for(int i=startInd;i<arr.length;i++){

            if(arr[i] == target){

                while(i+1 < arr.length && arr[i] == arr[i+1]){
                    i++;
                }
                target+=1;
                continue;
            }

            break;
        }

        System.out.println(target);


    }

    private static void sort(int[] arr , int l , int r){

        if(l >= r){
            return ;
        }

        int randomInd = l + random.nextInt(r-l+1);
        swap(arr , l , randomInd);

        int pivot = arr[l];

        int lt = l;
        int gt = r;
        int i = l+1;

        while(i <= gt){

            if(arr[i] < pivot){
                swap(arr , lt , i);
                lt++;
                i++;
            }
            else if (arr[i] > pivot){
                swap(arr , i , gt);
                gt--;
            }
            else {
                i++;
            }
        }

        sort(arr , l , lt-1);
        sort(arr , gt+1 , r);


    }

    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
