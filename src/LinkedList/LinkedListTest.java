package LinkedList;

public class LinkedListTest {


    public int counter = 0;

    //1->2->3->4->5->6-Head
    public static void main(String[] args){

        LinkedListTest test = new LinkedListTest();
        LinkedList value = test.recursiveTraverse(test.getList(),3);
        System.out.print(value.getData());

    }

    //Recursive approach for finding the nth last element in a linked list
    public LinkedList recursiveTraverse(LinkedList head, int n){

        LinkedList result  = head;

        if (head!=null){
            result = recursiveTraverse(head.getNext(),  n);
            counter++;
            if(counter==n){
                result = head;
            }
        }

        return result;
    }


    /**
     * This is 2 pointer approach
     * Time complexity 0(N)
     * Space complexity 0(1)
     */
    public int findNthLastElement(LinkedList head, int n){

        LinkedList pointer1, pointer2;
        pointer1 = pointer2 = head;

        for(int i=0;i<n;i++){
            pointer1 = pointer1.getNext();
        }

        while (pointer1!=null){
            pointer1 = pointer1.getNext();
            pointer2 = pointer2.getNext();
        }

        return pointer2.getData();
    }




    //head->1->2->3-Null
    //O(1) Time complexity 0(1) Space complexity
    public LinkedList addFirst(LinkedList head, LinkedList node){
        LinkedList first = head.getNext();
        node.setNext(first);
        head.setNext(node);
        return head;
    }

    //O(n) Space O(1) compelxity
    public LinkedList addLast(LinkedList head, LinkedList node){

        LinkedList travesingNode = head;
        while (travesingNode.getNext()!=null){
            travesingNode = travesingNode.getNext();
        }
        travesingNode.setNext(node);

        return head;
    }

    public LinkedList addAt(LinkedList head, LinkedList node, int target){

        LinkedList traversingNode = head;

        while((traversingNode.getData()!=target)){
            traversingNode = traversingNode.getNext();
        }

        LinkedList temp = traversingNode.getNext();
        traversingNode.setNext(node);
        node.setNext(temp);

        return head;

    }

    public void traverse(LinkedList head){

        if(head==null)
            return;

        LinkedList node = head.getNext();
        System.out.print("Head->");

        while (node!=null){
            System.out.print(node.getData()+"->");
            node = node.getNext();
        }

        System.out.print("Null");

    }




    public LinkedList getList(){

        LinkedList head = new LinkedList();
        LinkedList node1 = new LinkedList(1);
        LinkedList node2 = new LinkedList(2);
        LinkedList node3 = new LinkedList(3);
        LinkedList node4 = new LinkedList(4);
        LinkedList node5 = new LinkedList(5);
        LinkedList node6 = new LinkedList(6);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);


        return head;

    }
}
