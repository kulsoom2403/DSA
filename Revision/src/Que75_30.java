import java.util.LinkedList;
import java.util.Queue;

public class Que75_30 {

    // Static inner class
    static class RecentCounter {
        private Queue<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);
            while (queue.peek() < t - 3000) {
                queue.poll();
            }
            return queue.size();
        }
    }

    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();

        // Test inputs
        System.out.println(obj.ping(1));     // Output: 1
        System.out.println(obj.ping(100));   // Output: 2
        System.out.println(obj.ping(3001));  // Output: 3
        System.out.println(obj.ping(3002));  // Output: 3
    }
}
