public class Random_Pointer {


static class  Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}



        public Node copyRandomList(Node head) {
            if (head == null) return null;

            // Step 1: Create the new nodes and interleave them with the original list.
            Node curr = head;
            while (curr != null) {
                Node newNode = new Node(curr.val);
                newNode.next = curr.next;
                curr.next = newNode;
                curr = newNode.next;
            }

            // Step 2: Copy the random pointers for the new nodes.
            curr = head;
            while (curr != null) {
                if (curr.random != null) {
                    curr.next.random = curr.random.next;
                }
                curr = curr.next.next;
            }

            // Step 3: Separate the original list and the copied list.
            curr = head;
            Node newHead = head.next;
            Node newCurr = newHead;

            while (curr != null) {
                curr.next = curr.next.next;
                if (newCurr.next != null) {
                    newCurr.next = newCurr.next.next;
                    newCurr = newCurr.next;
                }
                curr = curr.next;
            }

            return newHead;
        }


    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(8);
        head.next.next = new Node(25);
        head.next.next.next = new Node(16);

        Random_Pointer random = new Random_Pointer();
         Node res = random.copyRandomList(head);
        randompoint(res);
    }
    public static void randompoint(Node node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

}
