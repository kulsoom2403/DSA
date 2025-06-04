import java.util.ArrayList;
import java.util.List;

public class Que75_36 {

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


        public boolean leafSimilar(TreeNode root1, TreeNode root2) {

            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            collectionleaf(root1,list1);
            collectionleaf(root2,list2);

            return list1.equals(list2);


        }
        private void collectionleaf(TreeNode node,List<Integer> list){
            if(node == null){
                return;
            }
            if(node.left == null && node.right == null){
                list.add(node.val);

            }

            collectionleaf(node.left,list);
            collectionleaf(node.right,list);

        }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(2);

        Que75_36 obj = new Que75_36();
        boolean result = obj.leafSimilar(root1,root2);
        System.out.println(result);

    }

}
