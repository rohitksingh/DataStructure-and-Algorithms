package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P819MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {

        Map<String, Integer> map = new HashMap();

        for(String word:paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")){
            word = word.toLowerCase();
            map.put(word, map.getOrDefault(word,0)+1);
        }

        for(String bannedWord: banned){
            if(map.get(bannedWord)!=null){
                map.remove(bannedWord);
            }
        }

        if(map.get("")!=null)){
            map.remove("");
        }

        PriorityQueue<String> countHeap = new PriorityQueue((a, b)->(map.get(b)-map.get(a)));
        countHeap.addAll(map.keySet());

        return countHeap.remove();

    }

}
