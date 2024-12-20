public class H_INDEX {

        public int hIndex(int[] citations) {
            int n = citations.length;

            int[] arr = new int[n+1];
            for(int c:citations) {


                if(c > n) {
                    arr[n]++;
                }
                else {
                    arr[c]++;
                }
            }

            int count = 0;
            for(int i = n;i >= 0;i--) {

                count = count + arr[i];
                if(count >= i) {
                    return i;
                }


            }
            return 0;

        }

    public static void main(String[] args) {
        int[] citations = {1,2,8,5,3};
        H_INDEX obj = new H_INDEX();
        int result = obj.hIndex(citations);

            System.out.println(result);

    }


}
