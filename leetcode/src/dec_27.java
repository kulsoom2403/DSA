import java.util.Arrays;

public class dec_27 {

        public int mostBooked(int n, int[][] meetings) {
            Arrays.sort(meetings,(a, b) -> a[0] - b[0]);
            int[] count = new int[n];
            long[] timer = new long[n];

            int itr = 0;

            while(itr < meetings.length){
                int[] curr = meetings[itr];
                int start = curr[0];
                int end = curr[1];
                long dur= end - start;

                int room = -1;
                long earliest = Long.MAX_VALUE;

                int ealiestRoom = -1;

                for(int i = 0; i < n; i++){
                    if(timer[i] < earliest){
                        earliest = timer[i];
                        ealiestRoom  = i;
                    }
                    if(timer[i] <= start){
                        room = i;
                        break;
                    }
                }
                if(room != -1){
                    timer[room] = end;
                    count[room]++;

                }else {
                    timer[ ealiestRoom ] += dur;
                    count[ ealiestRoom ]++;
                }
                itr++;
            }
            int max = 0;
            int index= 0;
            for(int i = 0; i < n;i++){
                if(count[i] > max ){
                    max = count[i];
                    index = i;
                }
            }
            return index;
        }

    public static void main(String[] args) {
        int n = 3;
        int[][] arr = {{2,3},{4,7},{8,10}};

        dec_27 obj = new dec_27();
        int result = obj.mostBooked(n,arr);
        System.out.println(result);
    }

}
