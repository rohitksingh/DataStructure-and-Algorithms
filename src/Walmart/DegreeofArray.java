package Walmart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DegreeofArray {


    public int findShortestSubArray(int[] nums) {

        Map<Integer, MetaData> table = new HashMap<>();

        for(int i =0;i<nums.length;i++){

            int element = nums[i];

            if(table.get(element)!=null){
                MetaData data = table.get(element);
                data.right(i);
                table.put(element, data);
            }else{
                MetaData data = new MetaData(i);
                table.put(element, data);
            }

        }

        Set<Integer> keys = table.keySet();
        int degree = 0;
        int distance = Integer.MAX_VALUE;

        for(Integer key:keys){
            if(table.get(key).count==degree){
                degree = table.get(key).count;
                if(table.get(key).distance<=distance){
                    distance = table.get(key).distance;
                }
            }else if(table.get(key).count>degree){
                degree = table.get(key).count;
                distance = table.get(key).distance;
            }
        }

        return distance;

    }
}


class MetaData{

    int left;
    int right;
    int count;
    int distance;

    public MetaData(int left){
        this.left = left;
        count = 1;
        distance = 1;
    }

    public void right(int right){
        count++;
        distance = right -left+1;
        this.right = right;
    }

    public String toString(){
        return distance+" "+count;
    }

}