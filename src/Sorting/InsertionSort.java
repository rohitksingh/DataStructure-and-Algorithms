package Sorting;

public class InsertionSort {

    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort();
        int[] sortedArray = insertionSort.sort(new int[]{0,2,4,3,7,6,9});
        insertionSort.print(sortedArray);
    }

    /**
     *                      Insertion sort
     *   In this algorithm we divide the array two part
     *      Sorted part
     *      Unsorted part
     *   The name comes from the fact that we insert element from unsorted part to sorted part
     *
     *   Algorithm
     *   - Start from index 1
     *   - Compare it with its left element if the left element is greater than current shift the element to right
     */

    public int[] sort(int[] arr){

        for(int i=1;i<arr.length-1;i++){

            int value = arr[i];
            int index = i;

            while(arr[index-1]>arr[i]){
                arr[index] = arr[index-1];
                index--;
            }

            arr[index] = value;

        }

        return arr;

    }

    public void print(int[] arr){
        for(int element: arr){
            System.out.print(element+" ");
        }
    }
}
