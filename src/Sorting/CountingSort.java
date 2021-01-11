package Sorting;

public class CountingSort {

    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        countingSort.sort(new int[]{1,1,2,2,3,3,3}, 4);
    }

    public int[] sort(int[] arr, int k){

        int[] temp = new int[k];
        int[] out = new int[arr.length];

        for(int i =0;i<arr.length;i++){
            int val = temp[arr[i]];
            temp[arr[i]] = val+1;
        }

        for(int i=1;i<temp.length;i++){
            temp[i] = temp[i]+temp[i-1];
        }

        for(int element: temp){
            System.out.print(element);
        }

        for(int i=arr.length-1;i>=0;i--){
            int key = arr[i];
            int pos = temp[key-1];
            System.out.println("Key is "+key+" pos is "+pos);
            temp[key] = pos-1;
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
