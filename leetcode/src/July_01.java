public class July_01 {

        public int possibleStringCount(String word) {
            int n = word.length();
            int count = 1;
            for(int i = 1;i < n;i++){
                if(word.charAt(i-1) == word.charAt(i)){
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        String word = "abbcccc";
        July_01 obj = new July_01();
        int result = obj.possibleStringCount(word);
        System.out.println(result);
    }
}
