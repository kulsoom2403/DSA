import java.util.HashMap;
import java.util.Random;

public class Preorder_Inorder {


      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }




        public TreeNode buildTree(int[] preorder, int[] inorder) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                hm.put(inorder[i], i);
            }


            return buildTreeHelper(preorder, inorder, 0, preorder.length - 1, 0, hm);
        }


        public TreeNode buildTreeHelper(int[] preorder, int[] inorder,
                                        int prestart, int preend,
                                        int inorderStart, HashMap<Integer, Integer> hm) {

            if (prestart > preend || inorderStart > preend) {
                return null;
            }


            int rootValue = preorder[prestart];


            TreeNode root = new TreeNode(rootValue);


            int inorderIndex = hm.get(rootValue);


            int leftTreeSize = inorderIndex - inorderStart;


            root.left = buildTreeHelper(preorder, inorder, prestart + 1, prestart + leftTreeSize, inorderStart, hm);


            root.right = buildTreeHelper(preorder, inorder, prestart + leftTreeSize + 1, preend, inorderIndex + 1, hm);

            return root;
        }

    public void inorderTraversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Preorder_Inorder prein = new Preorder_Inorder();


        TreeNode root = prein.buildTree(preorder, inorder);


        System.out.print("Inorder Traversal of the constructed tree: ");
        prein.inorderTraversal(root);
    }

}
