public class April_15 {

        public long goodTriplets(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int[] pos = new int[n];

            // Mapping positions of elements in nums2
            for (int i = 0; i < n; i++) {
                pos[nums2[i]] = i;
            }

            int[] mapped = new int[n];
            for (int i = 0; i < n; i++) {
                mapped[i] = pos[nums1[i]];
            }

            long[] left = new long[n];
            int[] bit = new int[n + 2]; // Binary Indexed Tree (Fenwick Tree)

            // Count elements to the left that are less than the current element
            for (int i = 0; i < n; i++) {
                left[i] = query(bit, mapped[i]);
                update(bit, mapped[i] + 1, 1);
            }

            long[] right = new long[n];
            bit = new int[n + 2]; // Reset BIT

            // Count elements to the right that are greater than the current element
            for (int i = n - 1; i >= 0; i--) {
                right[i] = query(bit, n) - query(bit, mapped[i] + 1);
                update(bit, mapped[i] + 1, 1);
            }

            long res = 0;
            for (int i = 0; i < n; i++) {
                res += left[i] * right[i]; // Counting valid triplets
            }
            return res;
        }

        // Update Binary Indexed Tree
        void update(int[] bit, int i, int val) {
            while (i < bit.length) {
                bit[i] += val;
                i += i & -i;
            }
        }

        // Query prefix sum in Binary Indexed Tree
        int query(int[] bit, int i) {
            int res = 0;
            while (i > 0) {
                res += bit[i];
                i -= i & -i;
            }
            return res;
        }



        public static void main(String[] args) {
            April_15 sol = new April_15();

            // Example input
            int[] nums1 = {2, 0, 1, 3};
            int[] nums2 = {0, 1, 2, 3};

            // Output the result
            long result = sol.goodTriplets(nums1, nums2);
            System.out.println("Number of good triplets: " + result);
        }



}
