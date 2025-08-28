package Lecture43;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });

        for (ListNode node:lists){
            if (node!=null){
                pq.add(node);
            }
        }

        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while (!pq.isEmpty()){
            ListNode nn = pq.remove();
            temp.next = nn;
            temp = temp.next;
            if (nn.next!=null){
                pq.add(nn.next);
            }
        }
        return dummy.next;
    }
}
