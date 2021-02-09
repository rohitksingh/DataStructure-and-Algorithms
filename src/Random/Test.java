package Random;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        new Test().groupAnagrams(strs);
    }


    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap();

        for(String str: strs){

            String key = sort(str);

            if(map.get(key)!=null){
                List<String> values = map.get(key);
                values.add(str);
                map.put(key, values);
            }else{
                map.put(key, Arrays.asList(str));
            }
        }


        return new ArrayList(map.values());


    }

    public String sort(String s){
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
