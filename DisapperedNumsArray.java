import java.util.*;

public class DisapperedNumsArray {

    static Random random = new Random();
    public static void main(String[] args) {
        
        int[] arr = new int[] {1,1};

        int len = arr.length;

        System.out.println(Arrays.toString(arr));

        List<Integer> li = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<len;i++){
            set.add(arr[i]);
        }

        for(int i=1;i<=len;i++){
            
            if(!set.contains(i)){
                li.add(i);
            }
        }

      
        System.out.println(li);
    }
}
