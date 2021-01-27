package Leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class P414ThirdMaxNumber {

    public int thirdMax(int[] nums) {

        Set<Integer> set = new HashSet();

        for(int element: nums){
            set.add(element);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        maxHeap.addAll(set);


        if(maxHeap.size()>=3){
            maxHeap.remove();
            maxHeap.remove();
        }

        return maxHeap.remove();
    }


}
