public class Que75_5 {

        public boolean canPlaceFlowers(int[] flowerbed, int n) {

            int len = flowerbed.length;



            for(int i = 0; i < len;i++) {

                if(flowerbed[i] == 0) {

                    int left = (i == 0) ? 0 : flowerbed[i-1];
                    int right = (i == len -1) ? 0 : flowerbed[i+1];


                    if(right == 0 && left == 0) {
                        flowerbed[i] = 1;
                        n--;
                        if(n == 0) {
                            return true;
                        }

                    }

                }

            }
            return n <= 0;

        }

    public static void main(String[] args) {
        int[] nums = {0,0,1,0,0,1,0,0};
        int n =2;
        Que75_5 obj = new Que75_5();
        boolean result = obj.canPlaceFlowers(nums,n);
        System.out.println(result);
    }
}
