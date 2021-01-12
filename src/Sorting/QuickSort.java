package Sorting;

/**
 *  TODO: Fix errors. Quick sort algorithm is not correct right now
 */
public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{1,4,3,6,5,7,9,3};
        int[] sortedArray = quickSort.sort(arr, 0, arr.length-1);
        for(int element: arr){
            System.out.print(element+" ");
        }
    }


    public int[] sort(int[] arr, int start, int end){

        System.out.println(start+" "+end);

        if(start<end){
            int pivot = pivot(arr, start, end);
            System.out.println("Pivot is "+pivot);
            sort(arr,0,pivot-1);
            sort(arr, pivot+1, end);
        }


        return arr;

    }

    public int pivot(int[] arr, int start, int end){

        int pivotElement = arr[end];
        int index = start;

        for(int i=start;i<end-1;i++){
            if(arr[i]<=pivotElement){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        int temp = arr[index];
        arr[index] = pivotElement;
        arr[end] = temp;

        return index;
    }
}
