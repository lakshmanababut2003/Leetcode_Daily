import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefixII2 {

    public static void main(String[] args) {
        
        int[] arr1 = new int[] {1 , 10 ,100};
        int[] arr2 = new int[]{1000};

        Set<Integer> set = new HashSet<>();

        int maxLen = 0;

        for(int ele : arr1){

            while(!set.contains(ele) && ele > 0){
                set.add(ele);
                ele/=10;
            }
        }

        for(int ele : arr2){

            while(!set.contains(ele) && ele > 0){
                ele/=10;
            }

            if(ele > 0){
                String str = String.valueOf(ele);
                maxLen = Math.max(maxLen , str.length());
            }
        }

        System.out.println(maxLen);
    }
    
}
