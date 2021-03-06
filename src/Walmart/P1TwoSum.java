package Walmart;

import java.util.HashMap;
import java.util.Map;

public class P1TwoSum {

    public static void main(String[] args) {
        char a = '2';
        char b = '2';
        int c =  Character.getNumericValue(a)+Character.getNumericValue(a);

        System.out.println(c);
    }

    /**
     *   1- check if the diff exists. Then add the key
     *
     *   Time complexity 0(n)
     *   Space complexity 0(n)
     */
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap();

        for(int i=0;i<nums.length;i++){

            if(map.get(target-nums[i])!=null){
                return new int[]{i, map.get(target-nums[i])};
            }

            map.put(nums[i],i);
        }

        return new int[]{-1,-1};

    }
}
