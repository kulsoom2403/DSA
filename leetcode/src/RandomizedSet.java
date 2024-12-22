import java.util.*;

public class RandomizedSet {

        HashMap<Integer,Integer> hm;
        List<Integer> list;

    public RandomizedSet() {
            hm = new HashMap<>();
            list = new ArrayList<>();


        }

        public boolean insert(int val) {
            if(hm.containsKey(val)) {
                return false;
            }
            list.add(val);
            hm.put(val,list.size() -1);
            return true;

        }

        public boolean remove(int val) {
            if(hm.containsKey(val) == false) {
                return false;
            }
            int n = hm.get(val);
            Collections.swap(list,n,list.size()-1);
            int value = list.get(n);
            hm.put(value,n);
            list.remove(list.size() - 1);
            hm.remove(val);
            return true;

        }

        public int getRandom() {
            Random random = new Random();
            int n = random.nextInt(list.size());
            return list.get(n);

        }


        public static void main(String[] args) {
            // Create an instance of RandomizedSet
            RandomizedSet obj = new RandomizedSet();

            // Test the insert method
            System.out.println("Insert 1: " + obj.insert(1)); // Should return true (1 is inserted)
            System.out.println("Insert 2: " + obj.insert(2)); // Should return true (2 is inserted)
            System.out.println("Insert 1 again: " + obj.insert(1)); // Should return false (1 is already in the set)

            // Test the getRandom method
            System.out.println("Get random: " + obj.getRandom()); // Should return either 1 or 2 randomly

            // Test the remove method
            System.out.println("Remove 2: " + obj.remove(2)); // Should return true (2 is removed)
            System.out.println("Remove 2 again: " + obj.remove(2)); // Should return false (2 is already removed)

            // Test insert and remove again
            System.out.println("Insert 2 again: " + obj.insert(2)); // Should return true (2 is inserted again)
            System.out.println("Get random after removing 2: " + obj.getRandom()); // Should return 1 or 2 randomly

            // Final state: Should have 1 and 2 in the set
            System.out.println("Remove 1: " + obj.remove(1)); // Should return true (1 is removed)
            System.out.println("Get random after removing 1: " + obj.getRandom()); // Should return 2, as it is the only element left
        }



}
