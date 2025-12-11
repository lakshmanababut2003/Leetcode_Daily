public class HappyNumber {

    public static void main(String[] args) {
        
        int n = 2;

        int slow = n;
        int fast = n;

        do{

            slow = sqr(slow);
            fast = sqr(sqr(fast));
        }
        while(slow != fast);

        System.out.println(slow == 1);
    }

    private static int sqr(int n){

        int ans = 0;

        while(n > 0){

            int temp = n % 10;
            ans += temp * temp;
            n = n/10;
        }

        return ans;
    }
    
}
