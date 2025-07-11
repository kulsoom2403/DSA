import java.util.Arrays;

public class July_11 {

        public int mostBooked(int n, int[][] meetings) {

            int[] count = new int[n];
            long[] busy = new long[n];

            Arrays.sort(meetings,(a, b) -> a[0] - b[0]);

            for(int[] meeting:meetings){
                int start = meeting[0];
                int end = meeting[1];
                int roomIndex = -1;
                boolean assigned = false;
                long earliest = Long.MAX_VALUE;

                for(int i = 0; i < n;i++){
                    if(busy[i] < earliest ) {
                        earliest  = busy[i];
                        roomIndex = i;
                    }
                    if(busy[i] <= start){
                        busy[i] = end;
                        count[i]++;
                        assigned = true;
                        break;
                    }
                }
                if(!assigned){
                    busy[roomIndex] += (end -start);
                    count[roomIndex]++;
                }
            }
            int max = 0,res =0;
            for(int i = 0; i< n;i++){
                if(count[i] > max){
                    max = count[i];
                    res = i;
                }
            }
            return res;


        }

    public static void main(String[] args) {
        int n = 2;
        int[][] arr = {{0,10,},{1,5},{2,7},{3,4}};

        July_11 obj = new July_11();
        int result = obj.mostBooked(n,arr);
        System.out.println(result);
    }
}
