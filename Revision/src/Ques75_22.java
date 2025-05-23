public class Ques75_22 {

        public int[] countBits(int n) {
            int[] arr = new int[n+1];
            for(int i = 0; i <= n;i++){
                arr[i] = arr[i >> 1] +(i & 1);
            }
            return arr;

        }

    public static void main(String[] args) {
        int n = 5;
        Ques75_22 obj = new Ques75_22();
        int[] result = obj.countBits(n);
       for(int num: result){
           System.out.print(num+" ");
       }
        System.out.println( );
    }
}
