import java.util.*;

public class ReversePolishNotation {

    public static void main(String[] args) {
        
        String[] arr = new String[] {"+" ,"4","13","5","/","+"};

        MyStack<Integer> nums = new MyStack<>();

        int len = arr.length;

        for(int i=0;i<len;i++){

            switch(arr[i]){
                case "+":{
                    int num2 = nums.pop();
                    int num1 = nums.pop();
                    nums.push(num1+num2);
                    break;
                }
                case "-":{
                    int num2 = nums.pop();
                    int num1 = nums.pop();
                    nums.push(num1 - num2);
                    break;
                }
                case "*":{
                    int num2 = nums.pop();
                    int num1 = nums.pop();
                    nums.push(num1*num2);
                    break;
                }
                case "/":{
                    int num2 = nums.pop();
                    int num1 = nums.pop();

                    if(num2 == 0){
                        nums.push(num1+num2);
                        System.out.println("Invalid Operation..");
                        break;
                    }

                     nums.push(num1 / num2);
                    break;
                }
                default:{
                    nums.push(Integer.parseInt(arr[i]));
                    break;
                }
            }
        }

        System.out.println(nums.pop());
    }
    
}

class MyStack<T>{

    private List<T> arr ;
    private int top = -1;

    public MyStack(){
        this.arr = new ArrayList<>();
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(T val){
        arr.add(val);
        top++;
    }

    public T pop(){

        if(isEmpty()){
            throw new EmptyStackException();
        }
        
        return  arr.remove(top--);
    }

    public T peek(){
        
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return arr.get(top);
    }
}
