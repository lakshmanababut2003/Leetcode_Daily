import java.util.Stack;

public class ValidStackSequence {

    public static void main(String[] args) {

        int[] push = new int[] { 1, 2, 3, 4, 5 };
        int[] pop = new int[] { 4,3,5,1,2};

        int  j = 0;

        int len = push.length;

        Stack<Integer> st = new Stack<>();

        for(int ele : push){

            st.push(ele);

            while(!st.isEmpty() && j < len && st.peek() == pop[j]){
                j++;
                st.pop();
            }
        }

        System.out.println(st.isEmpty());

       

    }

}
