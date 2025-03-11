public class March_8 {

        public int minimumRecolors(String blocks, int k) {
            int n = blocks.length();

            int min = 0;
            for(int i = 0; i < k;i++) {
                if(blocks.charAt(i) =='W'){
                    min++;

                }
            }
            int count = min;
            for(int i = k; i < n;i++) {
                if(blocks.charAt(i-k) =='W') {
                    count--;
                }
                if(blocks.charAt(i) == 'W') {
                    count++;
                }
                min = Math.min(min,count);
            }
            return min;

        }

    public static void main(String[] args) {
        String word = "WBBWWBBWBW";
        int k = 7;
        March_8 obj = new March_8();
        int result = obj.minimumRecolors(word,k);
        System.out.println(result);
    }
}
