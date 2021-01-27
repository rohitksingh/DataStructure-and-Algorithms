package Leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class P215KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        for(int element: nums){
            maxHeap.add(element);
        }

        for(int i=0;i<k-1;i++)
            maxHeap.remove();

        return maxHeap.remove();
    }
}
