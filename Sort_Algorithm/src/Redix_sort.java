public class Redix_sort {

public void redixfind(int[] arr,int size,int max,int position){
            int k=10;


            int[] count = new int[k + 1];
            int[] b = new int[size];


            for (int i = 0; i < size; i++) {
                count[(arr[i] / position) % 10]++;
            }


            for (int i = 1; i <= k; i++) {
                count[i] += count[i - 1];
            }


            for (int i = size - 1; i >= 0; i--) {
                b[--count[(arr[i] / position) % 10]] = arr[i];
            }


            for (int i = 0; i < size; i++) {
                arr[i] = b[i];
            }
        }



    }

