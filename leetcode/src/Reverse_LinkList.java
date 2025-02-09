public class Reverse_LinkList {


      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode leftpre = dummy;
            ListNode currentNode = head;

            for(int i = 0; i< left -1;i++) {
                leftpre = leftpre.next;
                currentNode = currentNode.next;

            }
            ListNode subListNode = currentNode;
            ListNode preNode = null;
            for(int i = 0;i <right -left + 1;i++) {
                ListNode nextNode = currentNode.next;
                currentNode.next = preNode;
                preNode = currentNode;
                currentNode = nextNode;
            }
            leftpre.next = preNode;
            subListNode.next = currentNode;
            return dummy.next;
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int left = 2;
        int right =4;
        Reverse_LinkList reverse = new Reverse_LinkList();
        ListNode ans = reverse.reverseBetween(head,left,right);
        reverseLinkList(ans);


    }
    public static void reverseLinkList(ListNode node){
          while (node != null) {
              System.out.print(node.val +" ");
              node = node.next;

          }
        System.out.println( );
    }
}
