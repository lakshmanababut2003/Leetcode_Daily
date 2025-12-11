public class IsSubSequence {

    public static void main(String[] args) {
        
        String s = "abced";
        String t = "ahbgdcade";

        int sp =0;
        int tp = 0;

        while( tp < t.length()){

            if(s.charAt(sp) == t.charAt(tp)){
                sp++;
            }
            
            tp++;
        }

        System.out.println(sp == s.length());
    }
    
}
