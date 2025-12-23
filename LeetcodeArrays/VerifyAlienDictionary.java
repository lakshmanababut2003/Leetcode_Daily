package LeetcodeArrays;

import java.util.*;

public class VerifyAlienDictionary {

    public static void main(String[] args) {
        
        String[] arr = new String[] {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        VerifyAlienDictionary obj = new VerifyAlienDictionary();

        System.out.println(obj.validDict(arr, order));
    }

    private boolean validDict(String[] arr , String order){

        Map<Character , Integer> map = new HashMap<>();

        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i) , i);
        }

        for(int i=0;i<arr.length-1;i++){

            for(int j=0; j<arr[i].length();j++){

                if(j >= arr[i+1].length()){
                    return false;
                }

                if(arr[i].charAt(j) != arr[i+1].charAt(j)){

                    int curr = map.get(arr[i].charAt(j));
                    int next = map.get(arr[i+1].charAt(j));

                    if(curr > next){
                        return false;
                    }
                    else{
                        break;
                    }
                }
            }
        }

        return true;
    }
    
}
