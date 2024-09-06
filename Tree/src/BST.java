import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
    Node root;

    public static void main(String[] args) {


        BST mybst = new BST();

        mybst.insert(mybst.root,4);
        mybst.insert(mybst.root,2);
        mybst.insert(mybst.root,7);
        mybst.insert(mybst.root,1);
        mybst.insert(mybst.root,3);
        mybst.insert(mybst.root,6);
        mybst.insert(mybst.root,9);
//        mybst.insert(mybst.root,13);



      System.out.println("-------------------------pre order-------------------");
        mybst.traverse(mybst.root);
        System.out.println("-------------------------inorder----------------------");
        mybst.inorder(mybst.root);
        System.out.println("--------------------------postorder-------------------");
        mybst.postorder(mybst.root);
        System.out.println("--------------------------BFS order-------------------");
        mybst.level(mybst.root);
        System.out.println("----------------------------DFS order-------------------");
        mybst.depthFirstSearch(mybst.root);
        System.out.println("---------------------a b c-------------------------");
        mybst.lca(mybst.root);
    }

    void traverse(Node node) {

        if (node != null) {
            System.out.println(node.key);

            traverse(node.left);

            traverse(node.right);


        }


    }

    void inorder(Node node) {

        if (node != null) {


            traverse(node.left);
            System.out.println(node.key);

            traverse(node.right);


        }


    }

    void postorder(Node node) {
        if (node != null) {


            traverse(node.left);


            traverse(node.right);
            System.out.println(node.key);

        }
    }

    public void insert(Node node,int key){
        if(this.root == null){
            Node newNode = new Node(key);
            this.root = newNode;

        }
        else {
            if(key < node.key){
                if(node.left==null){
                    Node newNode=new Node(key);
                    node.left=newNode;

                }
                else {
                    insert(node.left,key);
                }
            }
            else {
                if(node.right ==  null) {
                    Node newNode = new Node(key);
                    node.right = newNode;
                }
                else {
                    insert(node.right,key);
                }
            }
        }
    }
    public void level(Node node){
        Queue<Node> q = new LinkedList<>();


        q.add(node);

        while (!q.isEmpty()){
            Node current = q.poll();


            System.out.println(current.key);


            if(current.right != null){
                q.add(current.right);
            }
            if(current.left != null){
                q.add(current.left);
            }
        }

    }
    public void depthFirstSearch(Node node) {


        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.println(current.key);


            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }
    public void lca(Node node){
        Queue<Node> queue = new LinkedList<>();

        Node p =new Node(7);
        Node q=new Node(2);



        

    }


}

