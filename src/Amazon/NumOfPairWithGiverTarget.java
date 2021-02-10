package Amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumOfPairWithGiverTarget {


    public static void main(String[] args) {

        NumOfPairWithGiverTarget problem = new NumOfPairWithGiverTarget();
        int[] arr = new int[]{1, 1};
        int value = problem.numOfPair(arr, 2);
        System.out.println(value);

    }

    public int numOfPair(int[] arr, int target){

        Map<Integer,Boolean> map = new HashMap<>();
        Set<Integer> seen = new HashSet();
        int counter =0;

        for(int i=0;i<arr.length;i++){
            if(map.get(target-arr[i])!=null){

            }
            map.put(arr[i], true);
            seen.add(arr[i]);
        }


        return counter;

    }
}
