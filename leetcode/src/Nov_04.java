import java.util.*;

public class Nov_04 {




        // Updated find method
        private int find(Map<Integer, Integer> freqMap, int x, int[] window) {
            // Convert freqMap to list for sorting
            List<int[]> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                list.add(new int[]{entry.getKey(), entry.getValue()}); // {num, freq}
            }

            // Sort by frequency descending, then by number descending
            list.sort((a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1]; // frequency descending
                return b[0] - a[0];                    // bigger number first
            });

            // Take top x elements
            Set<Integer> topX = new HashSet<>();
            for (int i = 0; i < Math.min(x, list.size()); i++) {
                topX.add(list.get(i)[0]);
            }

            // Sum occurrences of top x elements in the current window
            int sum = 0;
            for (int num : window) {
                if (topX.contains(num)) sum += num;
            }

            return sum;
        }

        public int[] findXSum(int[] nums, int k, int x) {
            Map<Integer, Integer> freqMap = new HashMap<>();
            List<Integer> resultList = new ArrayList<>();
            int l = 0;

            for (int r = 0; r < nums.length; r++) {
                freqMap.put(nums[r], freqMap.getOrDefault(nums[r], 0) + 1);

                // Shrink the window if it exceeds size k
                while (l < r && (r - l + 1) > k) {
                    freqMap.put(nums[l], freqMap.get(nums[l]) - 1);
                    if (freqMap.get(nums[l]) == 0) {
                        freqMap.remove(nums[l]);
                    }
                    l++;
                }

                // If window size == k, compute the X-sum
                if ((r - l + 1) == k) {
                    int[] window = Arrays.copyOfRange(nums, l, r + 1);
                    resultList.add(find(freqMap, x, window));
                }
            }

            // Convert List<Integer> → int[]
            int[] result = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                result[i] = resultList.get(i);
            }

            return result;
        }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,4,2,3};
        int k = 6;
        int x = 2;

        Nov_04 obj = new Nov_04();
        int[] result = obj.findXSum(nums,k,x);

           System.out.println(Arrays.toString(result));

    }

}
