package Walmart;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySort {

    public static void main(String[] args) {
        FrequencySort fs = new FrequencySort();
        fs.sort(new int[]{1,3,3,4,5,6,8,6,1,3});
    }

    public void sort(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int element: arr){
            map.put(element, map.getOrDefault(element,0)+1);
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        priorityQueue.addAll(map.keySet());

        while(!priorityQueue.isEmpty()){
            int key = priorityQueue.remove();
            int frequency = map.get(key);
            for(int i=0;i<frequency;i++){
                System.out.print(key+" ");
            }
        }

    }
}
