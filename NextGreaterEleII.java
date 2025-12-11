import java.util.*;

public class NextGreaterEleII {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3,4,3};

        int n = arr.length;

        int[] res = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=2*n-1;i>=0;i--){

            int curr = arr[i % n];

            while(!st.isEmpty() && curr >= st.peek()){
                st.pop();
            }

            if(i < n){
                res[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(curr);
        }

        System.out.println(Arrays.toString(res));

    }
}
