
public class Que75_34 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }




        public int pairSum(ListNode head) {
            // Step 1: Find the middle
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse second half (starting from slow)
            ListNode prev = null;
            while(slow != null) {
                ListNode temp = slow.next;
                slow.next = prev;
                prev = slow;
                slow = temp;
            }

            // Step 3: Calculate max twin sum
            int maxSum = 0;
            ListNode first = head;
            ListNode second = prev; // head of reversed second half
            while(second != null) {
                maxSum = Math.max(maxSum, first.val + second.val);
                first = first.next;
                second = second.next;
            }

            return maxSum;
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Que75_34  obj = new Que75_34();
        obj.pairSum(head);

        ListNode curr = head;
        while (curr != null){
            System.out.print(curr.val);
            curr = curr.next;

        }
        System.out.println("null");

    }

}
