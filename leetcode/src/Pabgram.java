import java.util.HashSet;

public class Pabgram {

        public boolean checkIfPangram(String sentence) {
            if(sentence.length() < 26) {
                return false;
            }
            HashSet<Character> hs = new HashSet<>();

            for(char c:sentence.toCharArray()) {
                hs.add(c);
                if(hs.size() == 26) {
                    return true;
                }
            }
            return hs.size() == 26;
        }

    public static void main(String[] args) {
        String s ="ummekulsoom";
        Pabgram obj = new Pabgram();
        boolean result = obj.checkIfPangram(s);
        System.out.println(result);
    }

}
