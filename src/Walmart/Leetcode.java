package Walmart;

import java.util.HashMap;
import java.util.Map;

public class Leetcode {

    public static void main(String[] args){

        ListNode result = new Leetcode().getList(new int[]{2,4,6,8});
        new Leetcode().display(result);

    }


    //Problem 1
    //Twp Sum
    //0(N) Time complexity
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> table = new HashMap();

        for(int i =0;i<nums.length;i++){

            int element = nums[i];
            int diff = target-element;

            if(table.get(diff)!=null){
                return new int[]{table.get(diff), i};
            }

            table.put(element, i);
        }

        return new int[]{-1,-1};
    }


    //Problem4
    //Find median of two Sorted Array
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size1 = nums1.length;
        int size2 = nums2.length;
        int resultSize = size1+size2;
        double[] result = new double[resultSize];
        int i , j , k;
        i = j = k= 0;

        while(i<size1 && j<size2){
            if(nums1[i]<=nums2[j]){
                result[k++]=nums1[i++];
            }else{
                result[k++]=nums2[j++];
            }
        }

        if(i==size1){
            while(j<size2){
                result[k++]=nums2[j++];
            }
        }

        if(j==size2){
            while(i<size1){
                result[k++]=nums1[i++];
            }
        }

        int mid = resultSize/2;

        if(resultSize%2==0){
            return (result[mid-1]+result[mid])/2;
        }else{
            return result[mid];
        }


    }

    //Problem 7
    //Reverse Integer
    public int reverse(int x) {

        long out = 0;

        while(x!=0){
            int rem = x%10;
            out = out*10 + rem;
            x=x/10;
        }

        if(out>Integer.MAX_VALUE || out<Integer.MIN_VALUE)
            return 0;

        return (int)out;

    }

    //Problem 21
    //Merge two Sorted Linkedlist
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null && l2==null)
            return null;

        if(l1==null)
            return l2;

        if(l2==null)
            return l1;

        ListNode head, curr;
        head = curr = null;

        while(l1!=null && l2!=null){

            if(l1.val<=l2.val){

                ListNode node = new ListNode(l1.val);

                if(head==null){
                    head = node;
                    curr = node;
                }else{
                    curr.next = node;
                    curr = node;
                }

                l1 = l1.next;

            }else{
                ListNode node = new ListNode(l2.val);

                if(head==null){
                    head = node;
                    curr = node;
                }else{
                    curr.next = node;
                    curr = node;
                }

                l2 = l2.next;
            }

        }

        if(l1==null){
            curr.next = l2;
        }

        if(l2==null){
            curr.next = l1;
        }

        return head;
    }

    //Problem 34: Find First and Last Position of Element in Sorted Array
    public int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        boolean found = false;

        while(start<=end){

            int mid = (start+end)/2;

            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                found = true;
                break;
            }


        }

        if(!found)
            return new int[]{-1,-1};

        while(nums[start]<target){
            start++;
        }

        while(nums[end]>target){
            end--;
        }

        return new int[]{start,end};
    }


    //Create LinkedList from an array
    public ListNode getList(int[] arr){

        ListNode head, curr;
        head = curr = null;

        for(int element: arr){

            ListNode node = new ListNode(element);

            if(head==null){
                head = node;
                curr = node;
            }else {
                curr.next = node;
                curr = node;
            }
        }

        return head;

    }







    public void display(ListNode listNode){
        while (listNode!=null){
            System.out.print(listNode.val+"->");
            listNode = listNode.next;
        }

        System.out.print("Null");
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
