package LeetcodeArrays;

public class FindFirstAndLastEleInArr {

    public static void main(String[] args){

        int[] arr = new int[] {5,7,7,8,8,10};
        int target = 8;

        FindFirstAndLastEleInArr obj = new FindFirstAndLastEleInArr();

        int left = obj.binarySearch(arr , target , true);
        int right = obj.binarySearch(arr , target , false);

        System.out.println("[" + left + " , " + right + "]");

    }

    private int binarySearch(int[] arr , int tar , boolean isLeft){

        int l =0 , r= arr.length-1 , mid =0 , ind = -1;

        while(l <= r){

            mid = l + (r-l)/2;

            if(arr[mid] < tar){
                l = mid+1;
            }
            else if ( arr[mid] > tar){
                r=mid-1;
            }
            else{
                ind = mid;

                if(isLeft){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
        }

        return ind;
    }
    
}
