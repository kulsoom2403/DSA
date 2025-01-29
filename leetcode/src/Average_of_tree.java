import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_tree {


      public  static  class TreeNode {
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


        public List<Double> averageOfLevels(TreeNode root) {


            List<Double> list = new ArrayList<>();

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);


            if(root == null ) {
                return null;
            }
            while(!queue.isEmpty()) {
                int levelsize = queue.size();
                double sum = 0;

                for(int i = 0;i < levelsize;i++) {
                    TreeNode node = queue.poll();
                    sum = sum + node.val;

                    if(node.left != null) {
                        queue.offer(node.left);
                    }
                    if(node.right != null) {
                        queue.offer(node.right);
                    }

                }
                list.add(sum/levelsize);


            }
            return list;


        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(8);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(1);


        Average_of_tree average = new Average_of_tree();
        List res = average.averageOfLevels(root);
        System.out.println(res);

    }

}
