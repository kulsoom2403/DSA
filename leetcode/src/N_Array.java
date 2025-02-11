import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class N_Array {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
            children = new ArrayList<>();
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    // Preorder traversal method
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            list.add(current.val);

            // Push children in reverse order to maintain left-to-right order during traversal
            for (int i = current.children.size() - 1; i >= 0; i--) {
                stack.push(current.children.get(i));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        // Create the root node
        Node root = new Node(1);

        // Create child nodes
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);

        // Add children to root node
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        // Create child nodes for child1 and child2
        Node child1_1 = new Node(5);
        Node child2_2 = new Node(6);

        // Add children to child nodes
        child1.children.add(child1_1);
        child2.children.add(child2_2);

        // Create an instance of N_Array to access the preorder method
        N_Array nArray = new N_Array();

        // Perform preorder traversal and print the result
        List<Integer> result = nArray.preorder(root);
        System.out.println(result);  // Expected output: [1, 2, 5, 3, 6, 4]
    }
}
