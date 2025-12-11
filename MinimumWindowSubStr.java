public class MinimumWindowSubStr{

    public static void main(String[] args){

        String s = "ADOBECODEBANC";
        String t = "ABC";

        int[] tCount = new int[128];

        for(char ch : t.toCharArray()){
            tCount[ch]++;
        }

        int left = 0 , right = 0 , found = 0 , toFind = t.length();
        int minWindow = Integer.MAX_VALUE;

        String resultStr = "";

        char[] sChars = s.toCharArray();

        while(right < sChars.length){

            char ch = sChars[right];

            tCount[ch]--;

            if(tCount[ch] >= 0){
                found++;
            }

            while(found == toFind){
                if(minWindow > (right - left +1)){
                    minWindow = right-left+1;
                    resultStr = s.substring(left , right+1);
                }

                tCount[sChars[left]]++;

                if(tCount[sChars[left]] > 0){
                    found--;
                }

                left++;
            }

            right++;
        }

        System.out.println(resultStr);

        
    }
}