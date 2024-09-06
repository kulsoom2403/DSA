import java.util.LinkedList;
import java.util.Queue;

public class Longest_Depth {


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


        public int maxDepth(TreeNode root) {

            if(root == null){
                return 0;
            }

            Queue<TreeNode> q = new LinkedList<>();


            q.add(root);
            int dept = 0;

            while (!q.isEmpty()){
                int levelsize = q.size();

                dept++;
                for(int i = 0;i< levelsize;i++){


                    TreeNode current = q.poll();
                    if(current.right != null){
                        q.add(current.right);
                    }
                    if(current.left != null){
                        q.add(current.left);
                    }
                }
            }
            return dept;
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        Longest_Depth lg = new Longest_Depth();
        int depth = lg.maxDepth(root);

        System.out.println(depth);
    }





    }

