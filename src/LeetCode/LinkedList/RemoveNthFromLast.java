package LeetCode.LinkedList;

public class RemoveNthFromLast {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        ListNode temp = head;
        int count = 1;
        while (temp.next!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        if (count==n){
            return head.next;
        }
        int jumps = count-n;
        while (jumps>1){
            temp = temp.next;
            jumps--;
        }
        if (temp.next!=null && temp.next.next!=null){
            temp.next = temp.next.next;
        }else {
            temp.next = null;
        }
        return head;
    }
}
