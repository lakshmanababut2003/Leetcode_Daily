// leetcode-395

public class LongestSubStrKRepeatingChars {

    public static void main(String[] args) {

        String s = "aaabb";
        int k =3;

        System.out.println(longestSubStr(s, k));
        
    }

    private static int longestSubStr(String s , int k){

        int n = s.length();
        int[] arr = new int[26];

        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }

        for(int i=0;i<n;i++){

            if(arr[s.charAt(i)-'a'] < k){

                int left = longestSubStr(s.substring(0 , i), k);
                int right = longestSubStr(s.substring(i+1), k);
                return Math.max(left , right);
            }
        }

        return n;
    }
    
}
