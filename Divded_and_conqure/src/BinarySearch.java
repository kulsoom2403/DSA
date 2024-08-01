public class BinarySearch {

    public int binarySearch(int[] arr, int start, int end, int target) {
        if (end >= start) {
            int mid = (start + end)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return binarySearch(arr, start, mid - 1, target);
            }
            else {

                return binarySearch(arr, mid + 1, end, target);
            }
        }

        return -1;
    }
}
