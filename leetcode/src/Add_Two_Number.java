public class Add_Two_Number {


      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode ptr = result;

            int carry = 0;
            int sum = 0 + carry;

            while(l1 != null || l2 != null) {

                if(l1 != null) {
                    sum = sum + l1.val;
                    l1 = l1.next;

                }
                if(l2 != null) {
                    sum = sum + l2.val;
                    l2 = l2.next;
                }
                carry = sum/10;
                sum = sum %10;

                ptr.next = new ListNode(sum);
                ptr = ptr.next;
                sum = carry;


            }
            if(carry == 1)
                ptr.next = new ListNode(1);
            return result.next;

        }

    public static void main(String[] args) {
            ListNode head1 = new ListNode(2);
            head1.next = new ListNode(4);
            head1.next.next = new ListNode(3);

            ListNode head2 = new ListNode(5);
            head2.next = new ListNode(6);
            head2.next.next = new ListNode(4);


            Add_Two_Number add = new Add_Two_Number();
            ListNode res = add.addTwoNumbers(head1,head2);
             printList(res);

    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
