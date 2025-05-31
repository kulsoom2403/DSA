public class Que75_33 {

     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public ListNode deleteMiddle(ListNode head) {
            if(head == null || head.next == null){
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            ListNode pre = null;

            while(fast != null && fast.next != null){
                pre = slow;
                slow = slow.next;
                fast = fast.next.next;

            }
            pre.next = slow.next;
            return head;
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);



        Que75_33 obj = new Que75_33();
        obj.deleteMiddle(head);
        ListNode curr = head;
        while (curr!= null){
            System.out.println(curr.val);
            curr = curr.next;
        }
        System.out.println("null");
    }

}
