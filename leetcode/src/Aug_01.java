import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aug_01 {

        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<>();


            // int n  = numRows.lenght;
            // if(n == 1){

            // }
            // int[][] pascal =  new int[n];
            for(int i = 0; i < numRows ;i++){
                List<Integer> row = new ArrayList<>(Collections.nCopies(i+1,1));
                // int[] row = new int[i+1];
                for(int j = 1; j < i;j++){
                    int val = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    row.set(j,val);

                }
                list.add(row);
            }
            return list;


        }

    public static void main(String[] args) {
        int rowNumber = 5;
        Aug_01 obj = new Aug_01();
        List<List<Integer>> result = obj.generate(rowNumber);
        System.out.println(result);


    }

}
