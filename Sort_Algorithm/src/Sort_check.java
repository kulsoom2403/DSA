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

        public static void main(String[] args) {
            int[] arr = {7, 6, 10, 5, 9, 2, 1, 15, 7};
            Quick_sort sorter = new Quick_sort();
            sorter.quickSort(arr, 0, arr.length - 1);
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }

