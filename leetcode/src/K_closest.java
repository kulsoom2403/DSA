import java.util.Comparator;
import java.util.PriorityQueue;

public class K_closest {
    public int[][] kClosest(int[][] points, int k) {

        int[][] result = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<> (new PointComparator());

        for(int[] p: points){
            pq.offer(p);
        }
        for(int i = 0;i < k;i++){
            result[i] = pq.poll();
        }
        return result;
    }

    private int getDistance(int[] p) {
        return p[0] * p[0] + p[1] * p[1]; // Return x^2 + y^2
    }

    class PointComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            return getDistance(a) - getDistance(b);
        }

    }

    public static void main(String[] args) {
        K_closest kc = new K_closest();
        int[][] points ={{3,3},{5,-1},{-2,4}};
        int k = 2;
        int[][] result = kc.kClosest(points,k);
        for(int[] p:result){
            System.out.println("["+ p[0]+" "+p[1]+"]");

        }


    }
}
