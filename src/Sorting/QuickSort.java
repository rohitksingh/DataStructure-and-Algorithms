package Sorting;

/**
 *  TODO: Fix errors. Quick sort algorithm is not correct right now
 */
public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{1,4,3,6,5,7,9,8};
        quickSort.kOrderNum(arr,2);

        for(int element: arr){
            System.out.print(element+" ");
        }
    }

    public int[] sort(int[] arr, int start, int end){

        if(start<end){
            int pivot = pivot(arr, start, end);
            sort(arr, start, pivot-1);
            sort(arr, pivot+1, end);
        }

        return arr;
    }

    /**
     * In this function we select a pivot => in Laymen terms we first find the position of an element in the array
     * How do we find the posion of an element in an array?
     *      Simple let's say the element is K all the numbers <k will be on the left side and all the element >K will
     *      be on the right side.
     * This function returns the position of the element in the array
     */
    public int pivot(int[] arr, int start, int end){

        int pivot = arr[end];
        int pivotIndex = start;

        for(int i = 0;i<end;i++){
            if(arr[i]<pivot){
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;
            }
        }

        if(arr[pivotIndex]>pivot){
            int temp = pivot;
            arr[end] = arr[pivotIndex];
            arr[pivotIndex] = temp;
        }


        return pivotIndex;

    }


    //find the k smallest number in an array
    //Todo for some reason the loop does not stop
    //Fix it
    public int kOrderNum(int[] arr, int k){

        int pivot = arr.length;

        while (pivot!=k){
            System.out.println(pivot);
            if(k<pivot){
                pivot = pivot(arr, 0, pivot-1);
            }else{
                pivot = pivot(arr, pivot+1, k);
            }
        }

        return arr[pivot];

    }


}
