public class ReverseStringII {

    public static void main(String[] args) {
        
        String s = "abcdefg";
        int k = 2;

        char[] str = s.toCharArray();

        int n = s.length()-1;

        for(int i=0;i<= n-1;i+=2*k){

            if(i+k-1 <= n-1){
                reverse(i, i+k-1, str);
            }
            else{
                reverse(i, n-1, str);
            }
        }

        System.out.println(new String(str));

    }

    private static void reverse(int i , int j , char[] arr){

        while(i < j){

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }
    
}
