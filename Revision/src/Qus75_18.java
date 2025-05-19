import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Qus75_18 {

        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int num:arr){
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
            Set<Integer> set = new HashSet<>();
            for(int fre:hm.values()){
                if(set.contains(fre)){
                    return false;
                }
                set.add(fre);
            }
            return true;

        }

    public static void main(String[] args) {
        int[] arr ={-3,0,1,-3,1,1,1,-3,10,0};
        Qus75_18 obj = new Qus75_18();
        Boolean result = obj.uniqueOccurrences(arr);
        System.out.println(result);
    }

}
