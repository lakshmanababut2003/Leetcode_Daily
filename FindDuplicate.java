import java.util.HashMap;

public class FindDuplicate {

    public static void main(String[] args) {
        
        int[] arr = new int[] {3,1,4,2,2};

        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i] == arr[j]){
        //             System.out.println(arr[i]);
        //             break;
        //         }
        //     }
        // }

         int slow = arr[0];
    int fast = arr[0];

    while(true){
        slow = arr[slow];
        fast = arr[arr[fast]];

        if(slow == fast){
            break;
        }
    }

    int slow2 = arr[0];

    while(slow != slow2){
        slow = arr[slow];
        slow2 = arr[slow2];
    }

    System.out.println(slow);

        // HashMap<Integer , Integer> map = new HashMap<>();

        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        // }

        // for(int i=0;i<map.size();i++){
        //     if(map.get(arr[i] ) >= 2){
        //         System.out.println(arr[i]);
        //     }
        // }
    }
    
}
