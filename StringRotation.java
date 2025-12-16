public class StringRotation {

    public static void main(String[] args) {
        
        String s1 = "abcd";
        String s2 = "cdba";

        if(s1 == null || s2 == null){
            System.out.println(false);
            return;
        }

        if(s1.length() != s2.length()){
            System.out.println(false);
            return;
        }

        s1 = s1+s1;

        System.out.println(kmpSearch(s1, s2));

    }

    private static boolean kmpSearch(String s1 , String s2){
        
        int[] lps = buildLps(s2);

        int i=0 , j=0;

        while(i < s1.length()){

            if(s1.charAt(i) == s2.charAt(j)){

                i++;
                j++;

                if(j == s2.length()){
                    return true;
                }
            }
            else{

                if(j > 0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }

        return false;
    }

    private static int[] buildLps(String s2){

        int[] lps = new int[s2.length()];
        int len =0;
        int i=1;

        while(i < s2.length()){

            if(s2.charAt(i) == s2.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{

                if(len > 0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
    
}
