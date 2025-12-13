import java.util.ArrayList;
import java.util.List;

public class AddArrayFormOfInt {

    public static void main(String[] args) {
        
        int[] arr = new int[]{1,2,0,0};
        int k = 34;

        List<Integer> res = new ArrayList<>();

        for(int i=arr.length-1;i>=0;--i){
            res.add(0 , (arr[i]+k)%10);
            k= (arr[i]+k)/10;
        }

        while(k > 0){
            res.add(0 , k%10);
            k/=10;
        }

        System.out.println(res);
    }
    
}
