public class LongestIncSeq {

    public static void main(String[] args) {
        
        int[] arr = new int[] {0,1,0,3,2,3};

       int len = arr.length;

       int[] m = new int[len];

       for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){

                if(arr[i] > arr[j]){
                    if(m[j]+1 > m[i]){
                        m[i] = m[j]+1;
                    }
                }
            }
       }

       int maxInd =0;

       for(int i=0;i<m.length;i++){
            if(m[i] > m[maxInd]){
                m[i] = m[maxInd];
            }
       }

       System.out.println(m[maxInd]+1);
    }
    
}
