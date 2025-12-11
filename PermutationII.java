import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationII {

    public static void main(String[] args){

        int[] arr = new int[]{1,2,3};

        Set<List<Integer>> res = new HashSet<>();
        permutation(res , arr , 0);

        System.out.println(res);
    }

    private static void permutation(Set<List<Integer>> res , int[] arr , int start){

        if(start == arr.length){

            List<Integer> temp = new ArrayList<>();

            for(int ele : arr){
                temp.add(ele);
            }

            res.add(temp);
            return ;
        }

        for(int i=start ; i < arr.length;i++){

            swap(arr , start , i);
            permutation(res , arr , start+1);
            swap(arr , start , i);
        }
    }

    private static void swap(int[] arr , int i ,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
