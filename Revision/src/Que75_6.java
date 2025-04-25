public class Que75_6 {

        public String reverseVowels(String s) {
            String vowels = "aeiouAEIOU";
            char[] chars = s.toCharArray();
            int left = 0, right = s.length() - 1;

            while (left < right) {

                while (left < right && vowels.indexOf(chars[left]) == -1) {
                    left++;
                }

                while (left < right && vowels.indexOf(chars[right]) == -1) {
                    right--;
                }


                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }

            return new String(chars);
        }

    public static void main(String[] args) {
        String s = "leetcode";
        Que75_6 obj = new Que75_6();
        String result = obj.reverseVowels(s);
        System.out.println(result);
    }

}
