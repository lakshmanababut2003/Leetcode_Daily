public class LongestUnCommonSubSeq {

    public static void main(String[] args) {
        
        String[] arr = new String[] { "aaa" , "aaa" , "aa" };

        int len = arr.length;
        int maxLen = -1;

        for(int i=0;i<len;i++){

            boolean common = false;
            int currLen = arr[i].length();

            for(int j=0;j<len;j++){

                if(i != j && isSubSeq(arr[i], arr[j])){
                    common = true;
                    break;
                }
            }

            if(!common){
                maxLen = Math.max(maxLen , currLen);
            }
        }

        System.out.println(maxLen);
    }

    private static boolean isSubSeq(String a , String b){

        if(a.equals(b)){
            return true;
        }

        int i=0 , j=0;

        while(i < a.length() && j < b.length()){

            if(a.charAt(i) == b.charAt(j)){
                i++;
            }
            j++;
        }

        return i == a.length();

    }
    
}
