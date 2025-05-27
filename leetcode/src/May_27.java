public class May_27 {
        public int differenceOfSums(int n, int m) {
            int sum = 0;
            int sum2 = 0;
            for(int i = 1;i <= n;i++) {
                if(i%m != 0){
                    sum = sum + i;
                }
                else {
                    sum2 = sum2 + i;
                }
            }
            int result = sum - sum2;

            return result;

        }

    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        May_27 obj = new May_27();
        int result = obj.differenceOfSums(n,m);
        System.out.println(result);
    }
}
