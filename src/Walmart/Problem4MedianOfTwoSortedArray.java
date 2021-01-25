package Walmart;

public class Problem4MedianOfTwoSortedArray {

    /**
     *   1- mergedArray of type double
     *
     *   Time complexity 0(n+m)
     *   Space complexity 0(n+m)
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size1 = nums1.length;
        int size2 = nums2.length;
        int mergedSize = size1+size2;
        double[] mergedArray = new double[mergedSize];

        int i, j, k;
        i=j=k=0;

        while(i!=size1 && j!=size2){

            if(nums1[i]<=nums2[j]){
                mergedArray[k++] = nums1[i++];
            }else{
                mergedArray[k++] = nums2[j++];
            }

        }

        if(i!=size1 && j==size2){
            while(i!=size1){
                mergedArray[k++] = nums1[i++];
            }
        }

        if(j!=size2 && i==size1){
            while(j!=size2){
                mergedArray[k++] = nums2[j++];
            }
        }

        int mid = mergedArray.length/2;

        if(mergedArray.length%2==0){
            return (mergedArray[mid-1]+mergedArray[mid])/2;
        }else{
            return mergedArray[mid];
        }


    }

}
