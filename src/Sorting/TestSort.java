package Sorting;

public class TestSort {

    public static void main(String[] args){

        TestSort testSort = new TestSort();
        boolean result = testSort.hasRepeated(new int[]{1,2,4,5,6,1} );
        System.out.print(result);

    }


    //Q: Find if there are duplicates are present in an array given that extra space is not allowed
    //Complexity is 0(nlog(n)) is the sorting is done in nlog(n) [Heap sort]
    // nlog(n) + n = nlog(n)[Searching + linear scan]
    //If we use hashing it can be done in O(n) time
    public boolean hasRepeated(int[] arr){

        int[] sortedArray = new SelectionSort().sort(arr);

        int current = arr[0];
        int counter=0;
        for(int i=1;i<sortedArray.length;i++){
            counter++;
            if(arr[i]==current){
                return true;
            }else{
                current = arr[i];
            }
        }

        return false;
    }
}
