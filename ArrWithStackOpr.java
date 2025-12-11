import java.util.*;

public class ArrWithStackOpr {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2};
        int n = 4;

        List<String> li = new ArrayList<>();
        int input = 1;

        for(int ele : arr){

            while(input < ele){
                li.add("Push");
                li.add("Pop");
                input++;
            }

            li.add("Push");
            input++;
        }

        System.out.println(li);
    }
    
}
