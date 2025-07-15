public class July_15 {

        public boolean isValid(String s) {
            int n = s.length();
            if (n < 3) {
                return false;
            }

            int vowels = 0;
            int consonants = 0;

            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return vowels >= 1 && consonants >= 1;
        }

    public static void main(String[] args) {
        String s = "AEX332";
        July_15 obj = new July_15();
        boolean result = obj.isValid(s);
        System.out.println(result);
    }
}
