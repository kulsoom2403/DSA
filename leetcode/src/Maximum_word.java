public class Maximum_word
{

        public int mostWordsFound(String[] sentences) {
            int count = 0;

            for(String sentence:sentences) {
                int s = sentence.split(" ").length;

                count= Math.max(s,count);

            }
            return count;

        }

    public static void main(String[] args) {
        String[] arr ={"thrb nbkr nbtkt","ngkekekg ettkentke efjeb"};
        Maximum_word obj = new Maximum_word();
        int res = obj.mostWordsFound(arr);
        System.out.println(res);
    }
}
