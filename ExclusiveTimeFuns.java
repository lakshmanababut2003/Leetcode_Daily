import java.util.*;

public class ExclusiveTimeFuns {

    public static void main(String[] args) {

        int n = 2;

        List<String> logs = new ArrayList<>();

        logs.add("0:start:0");
        logs.add("1:start:2");
        logs.add("1:end:5");
        logs.add("0:end:6");

        Stack<LogLine> log = new Stack<>();
        int prevTime =0;
        int[] res = new int[n];

        for(String s : logs){

            LogLine l = new LogLine(s.split(":"));

            if(l.isStart){
                if(!log.isEmpty()){
                    LogLine prevL = log.peek();
                    res[prevL.id] += l.time - prevTime;
                }

                prevTime = l.time;
                log.push(l);
            }
            else{

                res[l.id] += l.time - prevTime+1;
                prevTime = l.time+1;
                log.pop(); 
            }
        }
        
            System.out.println(Arrays.toString(res));
    }
}

class LogLine{

    int id ;
    boolean isStart;
    int time;

    public LogLine(String[] arr){
        this.id = Integer.parseInt(arr[0]);
        this.isStart = (arr[1].equals("start"));
        this.time = Integer.parseInt(arr[2]);
    }
}
