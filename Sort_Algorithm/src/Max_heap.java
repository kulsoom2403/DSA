//public class Max_heap {
//
//
//    public static int maxHeap(int[] arr, int n, int value) {
//        n = n + 1;
//        arr[n] = value;
//        int i = n ;
//
//
//        while (i > 1) {
//            int parent = i  / 2;
//            if (arr[parent] < arr[i]) {
//                int temp = arr[parent];
//                arr[parent] = arr[i];
//                arr[i] = temp;
//                i = parent;
//            } else {
//                break;
//            }
//        }
//        return i;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {50, 30, 40, 10, 5, 20, 35};
//        int n = arr.length;
//
//        int element = 45;
//        int newPos = maxHeap(arr, n, element);
//
//        System.out.println("New position of the inserted element: " + newPos);
//
//        System.out.print("Updated Heap: ");
//        for (int i = 0; i <= n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
