import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        
        String s = "3[a]2[bc]";

       Stack<Integer> nums = new Stack<>();
       Stack<StringBuilder> str = new Stack<>();

       StringBuilder sb = new StringBuilder();
       int num =0;

       for(int i=0;i<s.length();i++){

            char curr = s.charAt(i);

            if(Character.isDigit(curr)){
                num =  num * 10 + (curr - '0');
            }
            else if(curr == '['){
                nums.push(num);
                num = 0;
                str.push(sb);
                sb = new StringBuilder();
            }
            else if(curr == ']'){

                String temp = sb.toString();
                sb = new StringBuilder(temp.repeat(nums.pop()));
                sb = str.pop().append(sb);
            }
            else{
                sb.append(curr);
            }
       }

       System.out.println(sb);
    }
    
}
