package LeetcodeArrays;

public class FindMinInRotateSortArr {

    public static void main(String[] args) {
        
        int[] arr = new int[] {11,13,15,17};

        FindMinInRotateSortArr obj = new FindMinInRotateSortArr();

        System.out.println(obj.findMinVal(arr));
    }

    private int findMinVal(int[] arr){

        int left = 0 , right = arr.length-1 , mid = 0;
        int min = Integer.MAX_VALUE;

        while(left <= right){

            if(arr[left] < arr[right]){
                min = Math.min(min , arr[left]);
            }

            mid = (left + right)/2;

            min = Math.min(min , arr[mid]);

            if(arr[left] <= arr[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return min;
    }
    
}
