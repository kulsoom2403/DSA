import java.util.ArrayList;
import java.util.List;

public class July_04 {

        public char kthCharacter(long k, int[] operations) {
            int shift = 0;
            List<Long> lengths = new ArrayList<>();

            long len = 1;

            for(int op :operations){
                len *= 2;
                lengths.add(len);
                if(len >= k) break;
            }
            for(int i = lengths.size()-1;i >= 0;i--){
                long half = lengths.get(i)/2;
                int op = operations[i];

                if(k > half){
                    k-= half;
                    if(op == 1){
                        shift++;

                    }
                }
            }
            return (char)((('a'-'a'+shift)%26 )+ 'a');

        }

    public static void main(String[] args) {
        long k = 10;
        int[] operations = {0,1,0,1};
        July_04 obj = new July_04();
        char result = obj.kthCharacter(k,operations);
        System.out.println(result);
    }
}
