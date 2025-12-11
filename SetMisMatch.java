import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SetMisMatch {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,2,4};

        Map<Integer , Integer> map = new HashMap<>();

        for(int ele : arr){
            map.put(ele , map.getOrDefault(ele , 0) +1);
        }

        int duplicate = 0 , missing =0;

        for(int i=1;i<=arr.length;i++){

            if(map.containsKey(i)){
                if(map.get(i) == 2){
                    duplicate = i;
                }
            }
            else{
                missing = i;
            }
        }

        int[] res = new int[2];

        res[0] = duplicate;
        res[1] = missing;

        System.out.println(Arrays.toString(res));
    }
    
}
