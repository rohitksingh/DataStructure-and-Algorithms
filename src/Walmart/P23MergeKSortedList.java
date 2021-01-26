package Walmart;

import java.util.PriorityQueue;

public class P23MergeKSortedList {

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> minHeap = new PriorityQueue();
        for(ListNode list: lists){
            while(list!=null){
                minHeap.add(list.val);
                list=list.next;
            }
        }

        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while(!minHeap.isEmpty()){
            curr.next = new ListNode(minHeap.remove());
            curr = curr.next;
        }

        return head.next;

    }
}

