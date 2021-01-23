package Walmart;

import java.util.HashMap;
import java.util.Map;

public class Leetcode {



    //Problem 1
    //Twp Sum
    //0(N) Time complexity
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> table = new HashMap();

        for(int i =0;i<nums.length;i++){

            int element = nums[i];
            int diff = target-element;

            if(table.get(diff)!=null){
                return new int[]{table.get(diff), i};
            }

            table.put(element, i);
        }

        return new int[]{-1,-1};
    }

}
