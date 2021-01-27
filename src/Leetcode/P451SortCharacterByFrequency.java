package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P451SortCharacterByFrequency {

    public String frequencySort(String s) {

        char[] charArray = s.toCharArray();
        Map<Character,Integer> map = new HashMap();
        for(char c: charArray){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> maxCountHeap =
                new PriorityQueue((a,b)->map.get(b)-map.get(a));

        maxCountHeap.addAll(map.keySet());

        int count=0;
        while(!maxCountHeap.isEmpty()){
            char key = maxCountHeap.remove();
            int freq = map.get(key);
            for(int i=0;i<freq;i++){
                charArray[count++] = key;
            }
        }

        return new String(charArray);
    }

}
