public class Faltten_Binary_Tree {

      public  static class TreeNode {
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


        public void flatten(TreeNode root) {
            if(root == null) {
                return;

            }
            flattenTree(root);
        }

        private TreeNode flattenTree(TreeNode node){
            if(node == null) {return null;
            }
            TreeNode left = flattenTree(node.left);
            TreeNode right = flattenTree(node.right);

            if(left != null) {
                node.right = left;
                node.left = null;

                TreeNode tem = left;
                while(tem.right != null) {
                    tem = tem.right;
                }
                tem.right = right;
            }
            else{
                node.right = right;
            }
            return node;
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        Faltten_Binary_Tree falten = new Faltten_Binary_Tree();
         falten.flattenTree(root);
        TreeNode current = root;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.right;
        }
    }






}
