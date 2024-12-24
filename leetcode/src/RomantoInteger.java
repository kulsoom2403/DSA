public class RomantoInteger {

        public String intoRoman(int num) {
            int[] number = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            String sum = "";

            for (int i = 0; num > 0; i++) {
                while (num >= number[i]) {
                    sum = sum + roman[i];
                    num = num - number[i];
                }
            }
            return sum;
        }

    public static void main(String[] args) {
        int num = 34232;
        RomantoInteger obj = new RomantoInteger();
        String result = obj.intoRoman(num);
        System.out.println(result);
    }


}
