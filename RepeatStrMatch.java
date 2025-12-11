public class RepeatStrMatch {

    public static void main(String[] args) {
        
        String a = "abcd";
        String b = "cdabcdab";

        System.out.println(findMatch(a , b));

    }

    private static int findMatch(String a , String b){

        int count =0;
        StringBuilder sb = new StringBuilder();

        while(sb.length() < b.length()){
            sb.append(a);
            count++;
        }

        if(sb.toString().contains(b)){
            return count;
        }

        sb.append(a);
        count++;

        if(sb.toString().contains(b)){
            return count;
        }

        return -1;
    }
    
}
