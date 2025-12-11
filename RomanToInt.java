// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

public class RomanToInt {

    public static void main(String[] args) {
        
        String s = "MCMXCIV";

        int len = s.length();

        int num =0 , ans =0;

        for(int i=len-1;i>=0;i--){

            char ch = s.charAt(i);

            switch(ch){
                case 'I':{
                    num = 1;
                    break;
                }
                case 'V':{
                    num = 5;
                    break;
                }
                case 'X':{
                    num =10;
                    break;
                }
                case 'L':{
                    num = 50;
                    break;
                }
                case 'C':{
                    num = 100;
                    break;
                }
                case 'D':{
                    num = 500;
                    break;
                }
                case 'M':{
                    num =1000;
                    break;
                }
            }

            if(4*num < ans){
                ans -= num;
            }
            else{
                ans +=num;
            }
        }

        System.out.println(ans);
    }
    
}
