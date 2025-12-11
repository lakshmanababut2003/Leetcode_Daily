public class BestTimetoBuyIII {

    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3,4,5};

        int b1 = -arr[0];
        int s1 = 0;
        int b2 = -arr[0];
        int s2 = 0;

        int len = arr.length;

        for(int i=0;i<len;i++){

            int price = arr[i];

            b1 = Math.max(b1 , -price);
            s1 = Math.max(s1 , b1+price);
            b2 = Math.max(b2 , s1-price);
            s2 = Math.max(s2 , b2+price);
        }

        System.out.println(s2);
    }
    
}
