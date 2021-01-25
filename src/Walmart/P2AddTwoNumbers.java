package Walmart;

/**
 *   Time complexity 0(m+n)
 *   Space complexity 0(m+n)
 */
public class P2AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1==null && l2==null)
            return null;

        if(l1==null)
            return l2;

        if(l2==null)
            return l1;

        ListNode head, curr;
        head = curr = null;
        int rem = 0;

        while(l1!=null && l2!=null){

            int val = l1.val+l2.val+rem;
            rem = val/10;
            val = (val<9) ? val : val%10;

            ListNode node = new ListNode(val);
            if(head==null){
                head = node;
                curr = node;
            }else{
                curr.next = node;
                curr = node;
            }

            l1 = l1.next;
            l2 = l2.next;

        }

        while(l1!=null){
            int val = l1.val+rem;
            rem = val/10;
            val = (val<9) ? val : val%10;
            ListNode node = new ListNode(val);
            curr.next = node;
            curr = node;
            l1 = l1.next;

        }

        while(l2!=null){
            int val = l2.val+rem;
            rem = val/10;
            val = (val<9) ? val : val%10;
            ListNode node = new ListNode(val);
            curr.next = node;
            curr = node;
            l2 = l2.next;
        }

        if(rem==1){
            curr.next = new ListNode(1);
        }

        return head;

    }



}
