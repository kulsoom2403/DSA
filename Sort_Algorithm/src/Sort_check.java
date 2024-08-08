public class Sort_check {
//    public static void main(String[] args) {
//        int[] arr={2,1,2,0,3,1,2,4};
//        int n=arr.length;
//        int k=4;
//        Counting_sort cs=new Counting_sort();
//        cs.count(arr,n,k);
//        for (int i : arr) {
//            System.out.print(i + " ");
//
//        }
//    }

    //    public static void main(String[] args) {
//        int[] arr = {7, 6, 10, 5, 9, 2, 1, 15, 7};
//        quickSort(arr, 0, arr.length - 1);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

//        public static void main(String[] args) {
//            int[] arr = {7, 6, 10, 5, 9, 2, 1, 15, 7};
//            Quick_sort sorter = new Quick_sort();
//            sorter.quickSort(arr, 0, arr.length - 1);
//            for (int i : arr) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//public static void main(String[] args) {
//    int[] arr={3,2,6,4,1,9,8};
//    Bubble_sort bs=new Bubble_sort();
//    bs.bubble(arr);
//    for (int i : arr) {
//        System.out.print(i + " ");
//        }


//    public static void main(String[] args) {
//        int[] arr={3,2,6,4,1,9,8};
//        Selection_sort ss=new Selection_sort();
//        ss.selection(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//
//
//    }
//    public static void main(String[] args) {
//        int[] arr={3,2,6,4,1,9,8};
//        Selection_sort ss=new Selection_sort();
//        ss.selection(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//
//
//    }
public static void main(String args[]) {
    JobNumber arr[] = { new JobNumber('a', 24, 18), new JobNumber('b', 24, 15), new JobNumber('c', 15, 10) };
    int n = arr.length;

    KnapsackGreedly knapsack = new KnapsackGreedly();
    double totalProfit = knapsack.calculateProfit(arr, n);
    System.out.println("Total Profit: " + totalProfit);
}


}
