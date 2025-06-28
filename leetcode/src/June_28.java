import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class June_28
{



        public int[] maxSubsequence(int[] nums, int k) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
            for (int i = 0; i < nums.length; i++) {
                pq.offer(new int[]{nums[i], i});
                if (pq.size() > k) pq.poll();
            }
            int[][] indices = pq.toArray(new int[0][0]);
            Arrays.sort(indices, Comparator.comparingInt(a -> a[1]));
            int[] result = new int[k];
            for (int i = 0; i < k; i++) {
                result[i] = nums[indices[i][1]];
            }
            return result;
        }

    public static void main(String[] args) {
        int[] nums ={2,1,3,3};
        int k = 2;

        June_28 obj = new June_28();
        int[] result = obj.maxSubsequence(nums,k);
        for(int num:result){
            System.out.print("{"+num+"}");
        }
    }
}
