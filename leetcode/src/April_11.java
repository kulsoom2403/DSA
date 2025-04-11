public class April_11 {
 int countSymmetricIntegers(int low, int high) {

            int count = 0;
            for(int i = low; i <= high;i++) {
                String s = Integer.toString(i);
                int len = s.length();
                int left = 0,right = 0;
                int mid = 0;
                if(len %2 == 0) {
                    mid = len /2;

                }
                for(int j = 0; j < mid;j++) {
                    left = left + s.charAt(j) -'0';
                }

                for(int k = mid;k < len;k++) {
                    right = right + s.charAt(k)-'0';
                }
                if(left == right) {
                    count++;
                }
            }
            return count;


        }


    public static void main(String[] args) {
     int low = 1;
     int high = 100;

     April_11 obj = new April_11();
     int result = obj.countSymmetricIntegers(low,high);
        System.out.println(result);

    }

}
