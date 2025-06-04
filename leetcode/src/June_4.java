public class June_4 {

        public String answerString(String word, int numFriends) {
            if(numFriends == 1){
                return word;
            }
            int n = word.length();


            String res ="";
            for(int i = 0; i < n;i++){
                String s = word.substring(i,Math.min(i+n-numFriends+1,n));
                if(res.compareTo(s) <=  0){
                    res = s;
                }
            }
            return res;



        }

    public static void main(String[] args) {
        String word = "abcd";
        int numFriends = 2;
        June_4 obj = new June_4();
        String result = obj.answerString(word,numFriends);
        System.out.println(result);

    }
}
