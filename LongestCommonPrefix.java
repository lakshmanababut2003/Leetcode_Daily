import java.util.Random;

public class LongestCommonPrefix {

    static Random random = new Random();

    public static void main(String[] args) {
        
        String[] arr = new String[] {"flower" , "flow" , "flight"};

        sort(arr , 0 , arr.length-1);

        StringBuilder sb = new StringBuilder();

        int i=0;
        while(i < arr[0].length() && i < arr[arr.length-1].length()){

            if(arr[0].charAt(i) == arr[arr.length-1].charAt(i)){
                sb.append(arr[0].charAt(i));
            }

            i++;
        }

        System.out.println(sb);

    }

    private static void sort(String[] arr , int l , int r){

        if(l >= r){
            return;
        }

        int randomInd = l + random.nextInt(r-l+1);
        swap(arr , l , randomInd);

        String pivot = arr[l];

        int lt = l;
        int gt = r;
        int i = l+1;

        while(i <= gt){

            int cmp = arr[i].compareTo(pivot);

            if(cmp < 0){
                swap(arr , lt  , i);
                lt++;
                i++;
            }
            else if(cmp > 0){
                swap(arr , i , gt);
                gt--;
            }
            else{
                i++;
            }
        }

        sort(arr , l , lt-1);
        sort(arr , gt+1 , r);

    }

    private static void swap(String[] arr , int i , int j){

        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
