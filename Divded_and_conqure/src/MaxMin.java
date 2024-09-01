public class MaxMin {
    public static int setmin(int[] A,int n){
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(A[i] < mini){
                mini = A[i];
            }
        }
        return mini;
    }
    public static int setmax(int[] A,int n){
        int max =Integer.MIN_VALUE;
        for(int i =0;i < n;i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A={4,9,6,5,2,3};
        int n = A.length;
        System.out.println("Mini Element is "+setmin(A,n));
        System.out.println("Max Element is  "+setmax(A,n));
    }
}
