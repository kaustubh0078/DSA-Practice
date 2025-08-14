package Lecture36;

import Lecture35.MiddleofLL;

public class SortList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while (headA!=null && headB!=null) {
            if (headA.val < headB.val) {
                temp.next = headA;
                headA = headA.next;
                temp = temp.next;
            } else {
                temp.next = headB;
                headB = headB.next;
                temp = temp.next;
            }
        }
        if (headA!=null){
            temp.next = headA;
        }
        if (headB!=null){
            temp.next = headB;
        }
        return dummy.next;
    }
    public ListNode getMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode mid = getMiddle(head);
        ListNode sh = mid.next;  // second half
        mid.next = null;
        ListNode a = sortList(head);
        ListNode b = sortList(sh);

        return mergeTwoLists(a,b);
    }
}
