public class NumberOfEmpl {

        public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            int count =0;

            for(int i = 0; i < hours.length;i++) {
                if(hours[i] >= target) {
                    count++;

                }
            }
            return count;

        }

    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4,5,6};
        int target = 3;
        NumberOfEmpl obj = new NumberOfEmpl();
        int result = obj.numberOfEmployeesWhoMetTarget(hours,target);
        System.out.println(result);
    }
}
