public class Straight_Min_Max {
    public static class MinMax {
        int min;
        int max;
    }
    public static MinMax findElement(int[] a){
            int min = a[0];
            int max = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                } else if (a[i] < min) {
                    min = a[i];
                }
            }
            MinMax ob1=new MinMax();
             ob1.max=max;
            ob1.min=min;
            return ob1;
    }
}



