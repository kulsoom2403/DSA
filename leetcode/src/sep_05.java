public class sep_05 {

        public int makeTheIntegerZero(int num1, int num2) {
            for(long ops = 0; ops <= 60;++ops){
                long target = num1 - ops * num2;
                if(Long.bitCount(target) <= ops && ops <= target)
                    return(int) ops;
            }
            return -1;
        }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = -1;

        sep_05 obj = new sep_05();
        int result = obj.makeTheIntegerZero(num1,num2);
        System.out.println(result);
    }
}
