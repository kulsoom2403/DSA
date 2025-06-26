public class June_26 {

        public int longestSubsequence(String s, int k) {
            int n = s.length();
            int count = 0;
            long value = 0;
            int pow = 0;
            int breakindex = -1;

            for(int i = n-1; i >= 0;i--){
                char  c = s.charAt(i);

                if(c == '0'){
                    count++;
                }else {
                    if(pow < 32){//use 32 its rang 2^32
                        value += (1L << pow);//calculate value 2^32
                        if(value <= k){
                            count++;
                        }else {
                            breakindex  = i;
                            break;
                        }

                    }
                    else {
                        breakindex = i;
                        break;
                    }
                }
                pow++;

            }
            for(int i = 0; i < breakindex;i++){
                if(s.charAt(i) == '0'){
                    count++;
                }
            }
            return count;


        }

    public static void main(String[] args) {
        String s ="0101110";
        int k = 5;

        June_26 obj = new June_26();
        int result = obj.longestSubsequence(s,k);
        System.out.println(result);
    }
}
