// leetcode 1566

import java.util.*;

public class DetectPatternRepeatingKTimes {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,4,4,4,4};

        int m = 1 , k =3;

        for(int i=0;i<arr.length-m;i++){

            int[] pattern = Arrays.copyOfRange(arr, i , i+m);
            int count = 1;

            for(int j=i+m;j<arr.length;j+=m){

                int[] eleArr = Arrays.copyOfRange(arr , j , j+m);

                if(Arrays.equals(pattern , eleArr)){
                    count++;

                    if(count == k){
                        System.out.println(true);
                        return;
                    }
                    
                }
                else{
                        break;
                    }
            }
        }

        System.out.println("false");
    }
    
}
