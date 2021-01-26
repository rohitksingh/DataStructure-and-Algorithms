package Walmart;

public class P26RemoveDuplicatesInSortedArray {

    /**
     *   Time complexity 0(n)
     *   Space complexity 0(1)
     *
     *   index = 1;
     *
     */
    public int removeDuplicates(int[] nums) {

        int index = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[index++] = nums[i+1];
            }
        }
        return index;
    }
}
