public class Product_Sum_Sub {

        public int subtractProductAndSum(int n) {
            int sum = 0;
            int pro = 1;
            while(n > 0){
                int x = n%10;
                pro = pro * x;
                sum = sum+ x ;

                n = n/10;








            }
            return pro - sum;
        }

    public static void main(String[] args) {
        int n = 3423;
        Product_Sum_Sub  obj = new Product_Sum_Sub();
        int res = obj.subtractProductAndSum(n);
        System.out.println(res);
    }
}
