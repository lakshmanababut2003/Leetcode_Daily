package LeetcodeArrays;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        
        int[] h = new int[] { 1,8,6,2,5,4,8,3,7};

        ContainerWithMostWater obj = new ContainerWithMostWater();

        System.out.println(obj.findMaxWater(h));
    }

    private int findMaxWater(int[] arr){

        int n= arr.length;

        int l =0 , r =n-1 , maxLen = -1;

        while( l < r){

            int w = r-l;
            int h = Math.min(arr[l] , arr[r]);
            int ans = w*h;
            maxLen = Math.max(ans , maxLen);

            if(arr[l] < arr[r]){
                l++;
            }
            else{
                r--;
            }
        }

        return maxLen;
    }
    
}
