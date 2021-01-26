package Walmart;

import java.util.*;

public class P49GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs==null)
            return null;

        Map<String, List<String>> map = new HashMap();

        for(String element : strs){

            String key = sort(element);
            if(map.get(key)!=null){
                List<String> anagrams = map.get(key);
                anagrams.add(element);
                map.put(key, anagrams);
            }else{
                List<String> anagrams = new ArrayList();
                anagrams.add(element);
                map.put(key, anagrams);
            }
        }

        return new ArrayList<>(map.values());

    }

    public String sort(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
