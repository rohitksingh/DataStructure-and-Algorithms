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

    public int[][] kClosest(int[][] points, int K) {

        Map<int[], Double> map = new HashMap();

        for(int[] point: points){
            int x = point[0];
            int y = point[1];
            double dis = distance(x,y);
            map.put(point,dis);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1]- a[0]*a[0]+a[1]*a[1]));

        minHeap.addAll(map.keySet());

        int[][] out = new int[K][2];
        for(int i=0;i<K-1;i++){
            out[i] = minHeap.remove();
        }


        return out;

    }

    public double distance(int x, int y){
        return Math.sqrt(x*x+y*y);
    }


}
