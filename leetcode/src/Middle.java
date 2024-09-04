public class Middle {

    

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode low = head;
        ListNode high = head;

        while (high != null && high.next != null) {
            high = high.next.next;
            low = low.next;
        }
        return low;


    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Middle m = new Middle();
        ListNode middle_elements = m.middleNode(head);

        if(middle_elements != null){
            System.out.println(middle_elements.val);
        }
        else{
            System.out.println("Not found");
        }


    }

}
