public class Counting_sort {

    public void count(int[] arr, int k, int n) {

        int[] count = new int[k + 1];
        int[] b = new int[arr.length];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= k; i++) {
            count[i] = count[i] + count[i - 1];

        }
        for (int i = n - 1; i >= 0; i--) {
            b[--count[arr[i]]] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = b[i];
        }

    }
}

