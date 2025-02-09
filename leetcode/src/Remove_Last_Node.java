public class Remove_Last_Node {


      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
               ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head == null || n <= 0) {
                return head;
            }
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode fast = dummy;
            ListNode slow = dummy;

            for(int i = 0; i <= n;i++) {
                if(fast == null) {
                    return head;
                }
                fast=fast.next;
            }
            while(fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;

            return dummy.next;

        }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 3;
        Remove_Last_Node remove = new Remove_Last_Node();
        ListNode ans = remove.removeNthFromEnd(head,n);
        remove_node(ans);
    }
    public static void  remove_node(ListNode node) {
          while (node != null) {
              System.out.println(node.val+" ");
              node = node.next;
          }
        System.out.println(" ");
    }

}
