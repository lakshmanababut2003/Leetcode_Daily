public class RepeartSubStrPattern {

    public static void main(String[] args) {
        
        String s = "aba";
        boolean res = false;
        
        int n = s.length();

        for(int i=1;i<=n/2;i++){

            if(n % i == 0){

                String subStr = s.substring(0 , i);
                StringBuilder sb = new StringBuilder();

                for(int j=0;j<n/i;j++){
                    sb.append(subStr);
                }

                if(sb.toString().equals(s)){
                    res = true;
                    break;
                }
            }
        }

        System.out.println(res);

        
    }
    
}
