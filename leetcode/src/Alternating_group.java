public class Alternating_group {

        public int numberOfAlternatingGroups(int[] colors, int k) {
            int n = colors.length;
            int count = 1;
            int result = 0;

            for(int i = 1; i < 2*n;i++){
                if(colors[i % n] == colors[(i - 1) % n])
                {
                    count = 1;
                }
                else {
                    count++;
                }
                if(i >= n && count >= k){
                    result++;
                }
            }

            return result;

        }

    public static void main(String[] args) {
        int[] colors ={1,0,1,0,1};
        int k = 3;
        Alternating_group obj = new Alternating_group();
        int result = obj.numberOfAlternatingGroups(colors,k);
        System.out.println(result);
    }
}
