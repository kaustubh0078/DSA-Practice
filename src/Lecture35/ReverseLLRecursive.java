package Lecture35;

public class ReverseLLRecursive {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        return reverse(null,head);
    }
    public ListNode reverse(ListNode prev, ListNode curr){
        if (curr==null){
            return prev;
        }
        ListNode temp = reverse(curr,curr.next);
        curr.next = prev;
        return temp;
    }
}
