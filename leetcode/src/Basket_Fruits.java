import java.util.HashMap;

public class Basket_Fruits {



        public int totalFruit(int[] fruits) {
            HashMap<Integer, Integer> hm = new HashMap<>();

            int up = 0;
            int down = 0;
            int maxCount = 0;


            for (up = 0; up < fruits.length; up++) {

                int count = hm.getOrDefault(fruits[up], 0);
                hm.put(fruits[up], count + 1);


                while (hm.size() > 2) {
                    int Fcount = hm.get(fruits[down]);
                    if (Fcount == 1) {
                        hm.remove(fruits[down]);
                    } else {
                        hm.put(fruits[down], Fcount - 1);
                    }
                    down++;
                }


                maxCount = Math.max(maxCount, up - down + 1);
            }

            return maxCount;
        }

    public static void main(String[] args) {
        int[] fruits ={1,2,1,1,1,3,4,2,2,2,2,2,4};
        Basket_Fruits backet = new Basket_Fruits();
        int result = backet.totalFruit(fruits);
        System.out.println(result);
    }


}
