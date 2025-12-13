package LeetcodeArrays;

public class SearchEleInRotateArr {

    public static void main(String[] args) {
        
        int[] arr = new int[] {4,5,6,7,0,1,2};
        int target = 0;

        SearchEleInRotateArr obj = new SearchEleInRotateArr();

        System.out.println(obj.findIndex(arr, target));
    }

    private int findIndex(int[] arr , int target){

        int left = 0 , right = arr.length-1 , mid = 0;


        while(left <= right){

           mid = (left + right)/2;

           if(arr[mid] == target){
            return mid;
           }

           if(arr[left] <= arr[mid]){
                if(arr[left] > target || arr[mid] < target){
                    left=mid+1;
                 }
                 else{
                    right = mid-1;
                 }
           }
           else{

            if(target > arr[right] || arr[mid] > target){
                right = mid-1;
            }
            else{
                left=mid+1;
            }
           }

           
        }

        

        return  -1;
    }
    
}
