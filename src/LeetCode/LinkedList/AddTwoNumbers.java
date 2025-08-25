package LeetCode.LinkedList;

public class AddTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;

        // Process both lists until both are null
        while (head1 != null || head2 != null) {
            int val1 = (head1 != null) ? head1.val : 0;
            int val2 = (head2 != null) ? head2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            temp.next = new ListNode(sum % 10); // create new node
            temp = temp.next;

            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;
        }

        // If carry remains, add it
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return dummy.next;
    }

}
