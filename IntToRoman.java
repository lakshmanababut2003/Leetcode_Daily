// I	1
// V	5
// X	10
// L	50
// C	100
// D	500
// M	1000

public class IntToRoman {

    public static void main(String[] args) {

        int num = 3749;
        StringBuilder sb = new StringBuilder();

        int[] nums = new int[] {1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1};
        String[] roman = new String[] {"M" , "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" , "IX" , "V","IV" , "I" };

        for(int i=0;i<nums.length;i++){

            int val = num / nums[i];

            while(val-- != 0){
                sb.append(roman[i]);
            }

            num = num % nums[i];
        }

        System.out.println(sb);
        
    }
    
}
