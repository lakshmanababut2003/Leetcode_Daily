// Find the length of the longest subarray where the difference between the maximum and minimum elements is ≤ 2.

// Example:
// [1, 3, 2, 2, 4, 2] → longest such subarray is [3,2,2 , 4, 2] → length = 5.

// Constraints:

// 1 ≤ n ≤ 10^5

// Must run in O(n) or O(n log n)

// Avoid brute force

public class LongestSubArrWithMaxMinDiff {

    public static void main(String[] args){

        int[] arr = new int[] {5, 4, 1, 3, 5};

        int kDiff = 2;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxLength = 0 , length = 0;

        int i=0 , j=i+1 ;

        while(i < arr.length && j< arr.length){

            if(arr[i] < arr[j]){
                max = arr[j];
                min = arr[i];
            }
            else{
                max = arr[i];
                min = arr[j];
            }

            int diff = max - min;

            if(diff <= kDiff){
                length++;
            }
            else{
                maxLength = Math.max(maxLength, length);
                length=0;
                i++;
            }

            j++;
        }

        System.out.println(maxLength+1);
    }
    
}
