import java.lang.invoke.SwitchPoint;

public class Sep_04 {

        public int findClosest(int x, int y, int z) {
            int p1 = Math.abs(x-z);
            int p2 = Math.abs(y-z);
            if(p1 > p2){
                return 2;
            }
            else if(p1<p2){
                return 1;
            }
            return 0;
        }

    public static void main(String[] args) {
        int x = 3;
        int y = 7;
       int z = 10;
        Sep_04 obj = new Sep_04();
        int result = obj.findClosest(x,y,z);
        System.out.println(result);
    }
}
