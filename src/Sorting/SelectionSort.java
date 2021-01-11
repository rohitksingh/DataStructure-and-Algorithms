package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] sorted = selectionSort.sort(new int[]{1,2,3,4,5,1});
        selectionSort.print(sorted);

    }

    /**
     * The name comes from the idea that this algorithms constantly selects the smallest element
     * One main difference between Bubble and Selection sort algorithms in code is
     * In Bubble sort swap is made each time arr[i]>arr[j]
     * While in Selection sort swap is made after finding the smallest element in one complete scan
     *
     * Algorithm
     *      - Find the smallest element in first scan and place it on first place
     *      - Find the second smallest and place it on 2nd place
     *      - Find the third smallest and plaec it .....
     *      - -- And so on
     */
    public int[] sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int smallestIndex=i;
            int smallest=arr[i];
            for(int j=i+1;j<arr.length; j++){
                if(arr[j]<smallest){
                    smallest = arr[j];
                    smallestIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }

        return arr;
    }

    public void print(int[] arr){
        for(int element: arr){
            System.out.print(element+" ");
        }
    }
}
