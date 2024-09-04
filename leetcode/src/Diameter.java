public class Diameter {

    int count = 0;

    public int diameterOfBinaryTree(Tnode root) {
        height(root);
        return count;
    }

    private int height(Tnode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        count = Math.max(count, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        Tnode root = new Tnode(3);
        root.left = new Tnode(5);
        root.right = new Tnode(1);
        root.left.left = new Tnode(6);
        root.left.right = new Tnode(2);
        root.right.left = new Tnode(0);
        root.right.right = new Tnode(8);
        root.left.right.left = new Tnode(7);
        root.left.right.right = new Tnode(4);


        Diameter diameterCalculator = new Diameter();


        int diameter = diameterCalculator.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree: " + diameter);
    }
}

class Tnode {
    int val;
    Tnode left;
    Tnode right;

    Tnode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
