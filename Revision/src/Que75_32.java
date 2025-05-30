import javax.net.ssl.HandshakeCompletedEvent;

public class Que75_32 {

      public static class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public ListNode oddEvenList(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenhead = even;

            while(even != null && even.next != null){
                odd.next = even.next;
                odd =  odd.next;

                even.next = odd.next;
                even = even.next;
            }

            odd.next = evenhead;
            return head;




        }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Que75_32 obj = new Que75_32();
        ListNode result = obj.oddEvenList(head);
        System.out.println("");
        printList(result);

    }
}
