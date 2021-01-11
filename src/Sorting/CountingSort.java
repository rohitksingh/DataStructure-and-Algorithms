package Sorting;

/**
 * Counting sort is good for small number of elements (K is small = 1..k)
 * Counting sort serves as a subroutine for Radix sort
 * Time complexity of Counting sort is 0(n+k) time and 0(k+n) space
 * It's a stable sorting algorithm
 *
 * Algorithm:
 *      - Initialise an empty array arr[K]          0(1)
 *      - Count the occurences of each element      0(n)
 *      - Add the occurance with the last one       0(K)
 *      - Scan the array from the back
 *      - Find the index of the element and place that element in the new array     0(n)
 */
public class CountingSort {

    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        countingSort.sort(new int[]{3,3,3,2,2,1,1}, 4);
    }

    //Time complexity is O(n+k)   //where K is the range of the number
    public int[] sort(int[] arr, int k){

        int[] temp = new int[k];
        int[] out = new int[arr.length];

        //Count the occurance                   0(n)
        for(int i =0;i<arr.length;i++){
            int val = temp[arr[i]];
            temp[arr[i]] = val+1;
        }

        //Adding so that we know the end index of the occurance         0(K)
        for(int i=1;i<temp.length;i++){
            temp[i] = temp[i]+temp[i-1];
        }

        for(int i=arr.length-1;i>=0;i--){
            int key = arr[i];              //Find the element to place
            int pos = temp[key]-1;         //Find the position
            temp[key] = temp[key]-1;       //Decrease the counter
            out[pos] = key;
            print(temp);
        }

        for(int element: out){
            System.out.print(element);
        }

        return arr;
    }

    public void print(int[] arr){
        for(int element : arr){
            System.out.print(element+" ");;
        }
        System.out.println();
    }
}
