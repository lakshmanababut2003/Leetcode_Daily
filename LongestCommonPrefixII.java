public class LongestCommonPrefixII {

    public static void main(String[] args) {
        
        int[] arr1 = new int[] {1,2,3 ,444 };
        int[] arr2 = new int[] {4,4,44};

        int arr1len = arr1.length;
        int arr2len = arr2.length;

        int maxLen = 0;

        for(int i=0 ; i < arr1len;i++){

            String a = String.valueOf(arr1[i]);

            for(int j=0;j<arr2len;j++){
                String b = String.valueOf(arr2[j]);
                maxLen = Math.max(maxLen , countCommanChars(a , b));
            }
        }

        System.out.println(maxLen);
    }

    private static int countCommanChars(String a , String b){

        if(a.equals(b)){
            return a.length();
        }

        int i=0 , j=0;

        while(i < a.length() && j < b.length()){

            if(a.charAt(i) == b.charAt(j)){
                i++;
            }

            j++;
        }

        return i;
    }
    
}
