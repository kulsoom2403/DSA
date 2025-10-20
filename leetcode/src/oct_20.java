public class oct_20 {

        public int finalValueAfterOperations(String[] operations) {
            int x = 0;
            int n = operations.length;

            for(int i = 0; i < n;i++){
                if(operations[i].charAt(0) == '+' || operations[i].charAt(2) == '+'){
                    x++;
                }
                else{
                    x--;
                }
            }
            return x;

        }

    public static void main(String[] args) {
            String[] operations = {"--x","x++","x--","x++","x++"};
            oct_20 obj = new oct_20();
            int result = obj.finalValueAfterOperations(operations);
        System.out.println(result);
    }
}
