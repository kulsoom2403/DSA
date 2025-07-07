import java.util.Arrays;
import java.util.PriorityQueue;

public class July_07 {

        public int maxEvents(int[][] events) {
            Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

            int day = 0, index = 0 , n = events.length ,result = 0;

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            while (!pq.isEmpty() || index < n) {
                if (pq.isEmpty()) {
                    day = events[index][0];
                }
                while (index < n && events[index][0] <= day) {
                    pq.offer(events[index][1]);
                    index++;
                }
                pq.poll();
                result++;
                day++;

                while (!pq.isEmpty() && pq.peek() < day) {
                    pq.poll();
                }
            }
            return result;
        }

    public static void main(String[] args) {
        int[][] arr ={{1,2},{2,3},{3,4}};
        July_07 obj = new July_07();
        int result = obj.maxEvents(arr);
        System.out.println(result);

    }
}
