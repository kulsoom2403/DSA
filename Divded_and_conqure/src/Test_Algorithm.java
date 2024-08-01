public class Test_Algorithm {

    public static void main(String[] args) {
        //int []a={5,7,9,13,32,42,54,56,88};


//        PowerElement p = new PowerElement();
//       double result= p.power(3.0,5);
//        System.out.println(result);
        int[] arr = {2, 3, 24, 5, 1, 4, 5};
        Merge_sort ms = new Merge_sort();
        Merge_sort.MS(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }
}







//                int[] arr = {8,9,10,20,30,40,50,55,56,78,80};
//                int target = 80;
//                BinarySearch bs=new BinarySearch();
//
//                int result = bs.binarySearch(arr, 0, arr.length - 1, target);
//
//                if (result != -1)
//                    System.out.println(result);
//                else
//                    System.out.println(-1);










//            int a[] = {2, 1, 3, 4, 5, 6, 7, 8};
//
//            int result= LinearSearch.ls(a,3);
//                 System.out.println(result);



//             Straight_Min_Max.MinMax result=Straight_Min_Max.findElement(a);
//
//            System.out.println(result.min);
//            System.out.println(result.max);
    //}
//}
