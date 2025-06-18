public class Que75_40 {

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

        int max = 0;
        private void solve(TreeNode node ,int steps,boolean goleft){
            if(node == null){
                return;
            }
            max = Math.max(max,steps);
            if(goleft == true){
                solve(node.left,steps+1,false);
                solve(node.right,1,true);
            }
            else {
                solve(node.right,steps+1,true);
                solve(node.left,1,false);
            }
        }
        public int longestZigZag(TreeNode root) {

            solve(root,0,true);
            solve(root,0,false);


            return max;


        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);

        Que75_40 obj = new Que75_40();
        int result = obj.longestZigZag(root);
        System.out.println(result);
    }

}
