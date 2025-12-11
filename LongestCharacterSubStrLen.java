public class LongestCharacterSubStrLen {

    public static void main(String[] args) {
        
        String s = "pwwkew";

        int len = s.length();
        int maxLen = 0 , start = 0;

        String resultStr = "";

        boolean[] visit = new boolean[256];

        for(int end = 0 ; end < len ;end++){

            char curr = s.charAt(end);

            while(visit[curr]){
                visit[s.charAt(start)] = false;
                start++;
            }

            visit[curr] = true;
            int length = end - start+1;

            if(length > maxLen){
                maxLen = length;
                resultStr = s.substring(start+1 , start+maxLen+1);
            }
            maxLen = Math.max(length , maxLen);
        }

        System.out.println(maxLen);
        System.out.println(resultStr);
    }
    
}
