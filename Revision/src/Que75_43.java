public class Que75_43 {
   
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
     
   
        public TreeNode searchBST(TreeNode root, int val) {

            if(root == null || root.val == val){
                return root;
            }
            if(val < root.val){
                return searchBST(root.left,val);
            }
            else {
                return searchBST(root.right,val);
            }
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        
        int val = 1;
        
        
        Que75_43 obj = new Que75_43();
        TreeNode treeNode = obj.searchBST(root,val);
        if(treeNode != null){
            System.out.println(treeNode.val);
        }
        else {
            System.out.println("not !");
        }
    }
}
