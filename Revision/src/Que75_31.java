import java.util.LinkedList;
import java.util.Queue;

public class Que75_31 {

        public String predictPartyVictory(String senate) {
            Queue<Integer> reainate = new LinkedList<>();
            Queue<Integer> dire = new LinkedList<>();

            int n = senate.length();

            for(int i = 0; i < n;i++){
                if(senate.charAt(i) == 'R'){
                    reainate.add(i);
                }
                else {
                    dire.add(i);
                }
            }
            while(!reainate.isEmpty() && !dire.isEmpty()){
                int r_index = reainate.poll();
                int d_index = dire.poll();

                if(r_index < d_index) {
                    reainate.add(r_index+n);
                }
                else {
                    dire.add(d_index+n);
                }
            }
            return reainate.isEmpty()?  "Dire" : "Radiant";

        }

    public static void main(String[] args) {
        String senate ="RDD";
        Que75_31 obj = new Que75_31();
        String result = obj.predictPartyVictory(senate);
        System.out.println(result);
    }
}
