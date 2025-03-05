public class March_5 {

        public long coloredCells(int n) {

            if(n == 0) {
                return 0;
            }
            else if (n == 1) {
                return 1;
            }


            return (long) (2L * n * (n - 1) + 1);
        }

    public static void main(String[] args) {
        int n = 654444;
        March_5 obj = new March_5();
        long result = obj.coloredCells(n);
        System.out.println(result);


    }
}
