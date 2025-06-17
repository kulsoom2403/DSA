public class Que75_39 {

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


        public int pathSum(TreeNode root, int targetSum) {

            if(root == null) {
                return 0;
            }

            int count = countPath(root, targetSum);


            count += pathSum(root.left, targetSum);
            count += pathSum(root.right, targetSum);

            return count;


        }
        private int countPath(TreeNode node,long target){
            if(node == null) {
                return 0;
            }
            int count = 0;
            if(node.val == target) {
                count++;

            }
            count += countPath(node.left,target - node.val);
            count +=countPath(node.right,target - node.val);

            return count;
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(8);

        int target = 8;


        Que75_39 obj = new Que75_39();
        int result = obj.pathSum(root,target);
        System.out.println(result);
    }
}
