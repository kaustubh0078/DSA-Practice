package Lecture36;

import java.util.WeakHashMap;

public class MergeTwoSortedLists {
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
}
