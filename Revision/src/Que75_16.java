public class Que75_16 {

        public int largestAltitude(int[] gain) {
            int n = gain.length;
            int max = 0;
            int[] arr = new int[n+1];

            for(int i = 0; i< gain.length;i++){
                if(i == 0) {
                    arr[i] = i+gain[i];
                }
                else {
                    arr[i] = arr[i-1] + gain[i];
                }
                max = Math.max(max,arr[i]);
            }
            return max;

        }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        Que75_16 obj = new Que75_16();
        int result = obj.largestAltitude(gain);
        System.out.println(result);
    }
}
