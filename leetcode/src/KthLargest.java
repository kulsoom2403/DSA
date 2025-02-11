import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




    class KthLargest {

        private int k;
        private List<Integer> list;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            this.list = new ArrayList<>();

            for(int num:nums) {
                list.add(num);
            }
            Collections.sort(list);


        }

        public int add(int val) {
            list.add(val);
            Collections.sort(list);

            return list.get(list.size() - k);
        }

        public static void main(String[] args) {
            int[] nums = {4,5,3,6};
            int k = 3;
            KthLargest obj = new KthLargest(k,nums);
            System.out.println(obj.add(3));  // Returns 4
            System.out.println(obj.add(5));  // Returns 5
            System.out.println(obj.add(10)); // Returns 5
            System.out.println(obj.add(9));  // Returns 8
            System.out.println(obj.add(4));  // Returns 8

        }
    }






