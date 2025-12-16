import java.util.*;

public class DistributeElementsinArr {

    public static void main(String[] args) {
        
        int[] arr = new int[] {2,1,3};

        int n = arr.length;

        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();

        int n1 = arr[0];
        int n2 = arr[1];

        li1.add(n1);
        li2.add(n2);

        for(int i = 2 ;i<n;i++){

            if(n1 > n2){
                li1.add(arr[i]);
                n1 = arr[i];
            }
            else{
                li2.add(arr[i]);
                n2 = arr[i];
            }

        }

        int[] res = new int[n];

        int ind = 0;

        for(int ele : li1){
            res[ind++] = ele;
        }

        for(int ele : li2){
            res[ind++] = ele;
        }

        System.out.println(Arrays.toString(res));
    }
    
}
