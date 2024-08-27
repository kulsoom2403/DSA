public class Min_Heap {
    public static class HeapInsertion {
        public static void insertMinHeap(int[] heap, int size, int value) {
            heap[size] = value;  // Insert the value at the end of the heap
            int index = size;    // Start from the inserted element

            // Bubble up the value to maintain the min-heap property
            while (index > 0 && heap[index] < heap[(index - 1) / 2]) {
                swap(heap, index, (index - 1) / 2);
                index = (index - 1) / 2;
            }
        }

        public static void swap(int[] heap, int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        public static void main(String[] args) {
            int[] heap = new int[6];
            int[] values = {10, 7, 11, 5, 4, 13};
            int size = 0;

            for (int i = 0; i < values.length; i++) {
                insertMinHeap(heap, size, values[i]);
                size++;

                System.out.print("Inserted value " + values[i] + ": ");
                for (int j = 0; j < size; j++) {
                    System.out.print(heap[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
