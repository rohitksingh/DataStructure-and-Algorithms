package LinkedList;

public class LinkedListTest {


    public static void main(String[] args){
        LinkedListTest test = new LinkedListTest();
        LinkedList output = test.addAt(test.getList(), new LinkedList(10),1);
        test.traverse(output);
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
