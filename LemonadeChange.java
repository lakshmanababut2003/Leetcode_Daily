public class LemonadeChange {

    public static void main(String[] args) {
        
        int[] arr = new int[] {5,5,5,10,20};

        int five =0 , ten =0;

        for(int ele : arr){

            if(ele == 5){
                five++;
            }
            else if(ele == 10){

                if(five > 0){
                    five--;
                    ten++;
                }
                else{
                    System.out.println(false);
                    return;
                }
            }
            else{

                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }
                else if(five > 2){
                    five-=3;
                }
                else{
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);
    }
    
}
