public class Sort_check {
    public static void main(String[] args) {
        int[] arr={2,1,2,0,3,1,2,4};
        int n=arr.length;
        int k=4;
        Counting_sort cs=new Counting_sort();
        cs.count(arr,n,k);
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }
}
