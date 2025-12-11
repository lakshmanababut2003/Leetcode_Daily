import java.util.*;

public class DailyTemp {

    public static void main(String[] args) {
        
        int[] arr = new int[] {73,74,75,71,69,72,76,73};

        int n = arr.length;

        int[] res = new int[n];

        Stack<Integer> nums = new Stack<>();

        for(int i=n-1;i>=0;i--){

            while(!nums.isEmpty() && arr[i] >= arr[nums.peek()]){
                nums.pop();
            }

            if(!nums.isEmpty()){
                res[i] = nums.peek() - i;
            }

            nums.push(i);
        }

        System.out.println(Arrays.toString(res));
    }
    
}
