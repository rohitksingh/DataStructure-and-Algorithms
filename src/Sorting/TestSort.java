package Sorting;

import java.util.Arrays;

public class TestSort {

    public static void main(String[] args){

        TestSort testSort = new TestSort();
        int[] arr = null;
        int index= testSort.removeDuplicate(null);
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }

    }


    //Remove duplicate from sorted array
    public int removeDuplicate(int[] arr){

        if(arr==null)
            return 0;

        if(arr.length==1)
            return 1;
        int prev = arr[0];
        int currentIndex = 1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=prev){
                arr[currentIndex] = arr[i];
                prev = arr[i];
                currentIndex++;
            }
        }

        return currentIndex;
    }


    //Encode a String eg aaabbcaa = a3b2c1a2
    public String encode(String input){

        if(input==null || input.length()==0)
            return "";

        char[] inputChars = input.toCharArray();
        char prevChar = inputChars[0];
        int counter = 1;
        StringBuilder output = new StringBuilder();

        for(int i=1;i<input.length();i++){
            if(inputChars[i]==prevChar){
                counter++;
            }else{
                output.append(prevChar).append(counter);
                prevChar = inputChars[i];
                counter=1;
            }
        }

        output.append(prevChar).append(counter);

        return new String(output);

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

    //Q: Find the number of max occurance of an element
    //O(nlog(n))
    public int maxRepeatedElement(int[] arr){

        if(arr==null)
            return 0;

        if(arr.length<2)
            return arr.length;

        Arrays.sort(arr);

        int maxValue = 1;
        int current = arr[0];
        int counter = 1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==current){
                counter++;
            }else{
                current = arr[i];
                maxValue = (maxValue<counter) ? counter : maxValue;
                counter=1;
            }
        }

        return maxValue;
    }
}
