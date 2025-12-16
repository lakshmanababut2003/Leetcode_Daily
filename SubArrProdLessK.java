public class SubArrProdLessK {

    public static void main(String[] args) {
        
        int[] arr =  new int[] {10,5,2,6};

        int k = 100;

        int ans = 0 , n = arr.length , prod =1 , j=0;

        for(int i=0;i<n;i++){

            prod*=arr[i];

            while(prod >=k && j<=i){
                prod /= arr[j++];
            }

            ans+= (i-j+1);
        }

        System.out.println(ans);
    }
    
}
