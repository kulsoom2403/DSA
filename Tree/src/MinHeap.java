import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {

            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;
    public List<Node> node;

    public MinHeap() {
        root = null;
        node = new ArrayList<>();
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {

            int index = node.size();
            node.add(newNode);

            Node parent = node.get((index - 1) / 2);
            if (index % 2 == 1) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }

            // Heapify up to maintain min-heap property
            heapifyUp(index);
        }
    }

    private void heapifyUp(int index) {
        Node current = node.get(index);
        int parentIndex = (index - 1) / 2;

        // Continue to heapify up if necessary
        while (index > 0 && node.get(parentIndex).key > current.key) {
            // Swap with parent
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void swap(int i, int j) {
        Node temp = node.get(i);
        node.set(i, node.get(j));
        node.set(j, temp);
    }

    public void printHeap() {
        for (Node node : node) {
            System.out.print(node.key + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(50);
        minHeap.insert(40);
        minHeap.insert(30);
        minHeap.insert(20);
        minHeap.insert(45);
        minHeap.insert(35);
        minHeap.insert(10);

        minHeap.printHeap();
}   }
