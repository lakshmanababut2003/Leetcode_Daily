public class MaximumRepeatingSubStr {

    public static void main(String[] args) {
        
        String s1 = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String s2 = "aaaba";

        String toFind = s2;
        int count =0;

        while(contains(s1 , toFind)){
            count++;
            toFind +=s2;
        }

        System.out.println(count);
    }

    private static boolean contains(String s1 , String s2){

        if(s2.length() > s1.length()){
            return false;
        }

        for(int i=0;i <= s1.length() - s2.length();i++){

            int j=0;

            while(j < s2.length() && s1.charAt(i+j) == s2.charAt(j)){
                j++;
            }

            if(j==s2.length()){
                return true;
            }
        }

        return false;

       
    }

   
}
