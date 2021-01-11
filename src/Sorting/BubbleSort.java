package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] aortedArray = bubbleSort.sortImproved(new int[]{1,2,3,4,5,6,7});
        bubbleSort.print(aortedArray);
    }

    //Worst case and Best case complexity is O(n^2)
    public int[] sort(int[] arr){
        int counter = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                counter++;
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(counter);
        return arr;
    }

    //It is improved Bubble sort
    //It runs 0(n) if the list is sorted
    //1,2,3,4,5,6,7  runs 6 times while normal algorithm runs 21 times
    public int[] sortImproved(int[] arr){

        boolean swapped = true;
        int counter = 0;
        for(int i=0;i<arr.length-1 && swapped;i++){
            swapped = false;
            for(int j=i+1;j<arr.length;j++){
                counter++;
                if(arr[i]>arr[j]){
                    swapped = true;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(counter);
        return arr;

    }

    public void print(int[] arr){
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}
