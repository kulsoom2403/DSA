public class Add_digits {

        public int addDigits(int num) {

            if(num == 0) {
                return 0;
            }
            while(num >= 10) {
                int sum = 0;
                while(num > 0) {
                    sum = sum + num%10;
                    num = num/10;
                }
                num = sum;

            }
            return num;


        }

    public static void main(String[] args) {
        int num =5485;
        Add_digits obj = new Add_digits();
        int result = obj.addDigits(num);
        System.out.println(result);
    }
}
