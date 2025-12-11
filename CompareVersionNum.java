public class CompareVersionNum {

    public static void main(String[] args) {
        
        String v1= "1.2";
        String v2 = "1.10";

        int v1Len = v1.length();
        int v2Len = v2.length();

        int ind1 =0;
        int ind2 =0;

        int version = 0;

        while(ind1 < v1Len || ind2 < v2Len){

            int rev1 =0;

            while(ind1 < v1Len && v1.charAt(ind1) != '.'){
                rev1 = rev1 * 10 + (v1.charAt(ind1) - '0');
                ind1++;
            }

            int rev2 =0;

            while(ind2 < v2Len && v2.charAt(ind2) != '.'){
                rev2 = rev2 * 10 + (v2.charAt(ind2) - '0');
                ind2++;
            }

            if(rev1 != rev2){

                if(rev1 < rev2){
                    version = -1;
                    break;
                }
                else if(rev1 > rev2){
                    version = 1;
                    break;
                }
            }

            ind1++;
            ind2++;
        }

        System.out.println(version);
    }
    
}
