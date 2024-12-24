public class LastOfWorld {

        public int lengthOfLastWord(String s) {
            int size = 0;
            int i =s.length() - 1;
            while(i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            while(i >= 0 && s.charAt(i) != ' ' ) {
                size++;
                i--;
            }

            return size;
        }

    public static void main(String[] args) {
        String s = "Hello World  ";
        LastOfWorld obj = new LastOfWorld();
        int result = obj.lengthOfLastWord(s);
        System.out.println(result);
    }
}
