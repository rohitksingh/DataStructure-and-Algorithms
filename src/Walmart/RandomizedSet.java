package Walmart;

import java.util.*;

class RandomizedSet {

    Map<Integer, Integer> hashSet;

    public RandomizedSet() {
        hashSet = new HashMap();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hashSet.get(val)==null){
            hashSet.put(val,val);
            return true;
        }else{
            return false;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(hashSet.get(val)==null){
            return false;
        }else{
            hashSet.remove(val);
            return true;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {

        List<Integer> values = new ArrayList(hashSet.values());
        int randomNum = new Random().nextInt(values.size());
        return values.get(randomNum);
    }
}