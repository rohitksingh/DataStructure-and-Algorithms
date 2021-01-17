package LinkedList;

public class LinkedListTest {


    public static void main(String[] args){
        LinkedListTest test = new LinkedListTest();
        test.traverse(new LinkedList());
    }




    public void traverse(LinkedList head){

        if(head==null)
            return;

        LinkedList node = head.getNext();

        while (node!=null){
            System.out.print(node.getData());
            node = node.getNext();
        }

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
