
import java.util.*;

public class SmalllestElementsSelf {

    public static void main(String[] args) {
        
        int[] arr = new int[] {8 , 1, 2, 2, 3};

        Map<Integer , Integer> map = new HashMap<>();

        int[] res = arr.clone();

        Arrays.sort(res);

        for(int i=0;i<res.length;i++){
            map.putIfAbsent(res[i] , i);
        }

        for(int i=0;i<arr.length;i++){
            res[i] = map.get(arr[i]);
        }

        System.out.println(Arrays.toString(res));
    }
    
}
