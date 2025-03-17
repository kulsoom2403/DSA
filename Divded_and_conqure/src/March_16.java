import java.util.Arrays;

public class March_16 {



        public boolean canRepairInTime(int[] ranks, int cars, long time) {
            long totalCars = 0;
            for (int rank : ranks) {
                long k = (long) Math.sqrt(time / rank); // Maximum cars a mechanic can repair in 'time'
                totalCars += k;
                if (totalCars >= cars) {
                    return true;
                }
            }
            return false;
        }

        public long repairCars(int[] ranks, int cars) {
            long low = 1, high = (long) Arrays.stream(ranks).min().getAsInt() * (long) cars * (long) cars; // Prevent overflow
            while (low < high) {
                long mid = low + (high - low) / 2; // Avoid overflow in (low + high) / 2
                if (canRepairInTime(ranks, cars, mid)) {
                    high = mid; // Try smaller time
                } else {
                    low = mid + 1; // Increase time
                }
            }
            return low;
        }


    public static void main(String[] args) {
        int[] rank ={4,3,5};
        int cars = 10;
        March_16 obj = new March_16();
        long result = obj.repairCars(rank,cars);
        System.out.println(result);

    }

}
