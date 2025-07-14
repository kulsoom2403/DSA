public class July_14 {
     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public int getDecimalValue(ListNode head) {
            int result = 0;
            while(head != null){
                result = (result << 1) | head.val;
                head = head.next;

            }
            return result;



        }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(0);
        node.next.next = new ListNode(1);

        July_14 obj = new July_14();
        int result = obj.getDecimalValue(node);
        System.out.println(result);
    }


}
