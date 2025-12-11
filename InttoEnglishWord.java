public class InttoEnglishWord {

    private static final String[] ones = new String[]{
        "" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" 
    };

    private static final String[] teens = new String[]{
        "Ten","Eleven" , "Twelve" , "Thirteen" , "Fourteen" , "Fifteen" , "Sixteen" , "Seventeen" , 
        "Eighteen" , "Nineteen"
    };

    private static final String[] tens = new String[]{
      "" ,  "Ten" , "Twenty" , "Thirty" , "Forty" , "Fifty" , "Sixty" , "Seventy" , "Eighty" , "Ninety "
    };

    public static void main(String[] args) {
        
        int num = 12345;

        if(num == 0){
            System.out.println("Zero");
            return;
        }

        System.out.println(toConvert(num));
    }

    private static String toConvert(int num){

        String res = new String();

        if(num < 10){
            res = ones[num];
        }
        else if(num < 20){
            res = teens[num -10];
        }
        else if(num < 100){
            res = tens[num / 10] + " " + toConvert(num % 10);
        }
        else if(num < 1000){
            res = toConvert(num / 100) + " Hundred " + toConvert(num % 100);
        }
        else if(num < 1000000){
            res = toConvert(num / 1000) + " Thousand " + toConvert(num % 1000);
        }
        else if(num < 1000000000){
            res = toConvert(num / 1000000) + " Million " + toConvert(num % 1000000);
        }
        else{
            res = toConvert(num / 1000000000) + " Billion" + toConvert(num % 1000000000);
        }

        return res.trim();

    }

    
}
