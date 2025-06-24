import java.util.*;

public class June_24 {

        public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
            int n = nums.length;
            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                if (nums[i] == key) {
                    int start = Math.max(0, i - k);
                    int end = Math.min(n - 1, i + k);

                    for (int j = start; j <= end; j++) {
                        set.add(j);
                    }
                }
            }
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);

            return list;


        }

    public static void main(String[] args) {
        int[] nums ={2,4,2,5,7};
        int key = 2;
        int k = 1;

        June_24 obj = new June_24();
        List<Integer> list =obj.findKDistantIndices(nums,key,k);
        if(list != null){
            System.out.println(list);
        }



    }

}
