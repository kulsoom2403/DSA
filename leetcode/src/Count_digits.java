public class Count_digits {

        public int countDigits(int num) {
            int count = 0;
            int sum = 0;
            int ori = num;
            while(num > 0) {
                int digit = num%10;
                num = num/10;
                if(digit   != 0 && ori % digit == 0) {
                    count++;

                }
            }


            return count;

        }

    public static void main(String[] args) {
        int num =786;
        Count_digits obj =  new Count_digits();
        int result =obj.countDigits(num);
        System.out.println(result);
    }
}
