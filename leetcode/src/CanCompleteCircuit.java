public class CanCompleteCircuit {

        public int canCompleteCircuit(int[] gas, int[] cost) {
            int totalgas = 0;
            int totalcost = 0;
            int currentgas = 0;
            int startstation = 0;


            for (int i = 0; i < gas.length; i++) {
                totalgas =totalgas + gas[i];
                totalcost = totalcost +  cost[i];
            }


            if (totalgas < totalcost) {
                return -1;
            }


            for (int i = 0; i < gas.length; i++) {
                currentgas = currentgas + gas[i] - cost[i];


                if (currentgas < 0) {
                    startstation = i + 1;
                    currentgas = 0;
                }
            }

            return startstation;
        }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        CanCompleteCircuit c = new CanCompleteCircuit();
       int result =  c.canCompleteCircuit(gas,cost);
        System.out.println(result);
    }


}
