

public class PermutationStr {

    public static void main(String[] args) {

        String s1 = "prosperity";
        String s2 = "properties";

        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];

        int s1Len = s1.length();
        int s2Len = s2.length();

        for(int i=0;i<s1Len;i++){
            s1Arr[s1.charAt(i)-'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }

        if(isContains(s1Arr , s2Arr)){
            System.out.println(true);
            return;
        }

        for(int i=s1Len;i<s2Len;i++){

            s2Arr[s2.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i - s1Len) - 'a']--;

            if(isContains(s1Arr , s2Arr)){
            System.out.println(true);
            return;
            }

        }

        System.out.println(false);
        
    }

    private static boolean isContains(int[] arr1 , int[]arr2){

        for(int i=0;i<26;i++){

            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }
}
