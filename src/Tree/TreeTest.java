package Tree;

public class TreeTest {

    public static void main(String[] args){

        TreeTest treeTest = new TreeTest();
        treeTest.preTraversal(treeTest.getBinaryTree());
    }

    public void preTraversal(BinaryTree binaryTree){

        if(binaryTree==null)
            return;

        System.out.print(binaryTree.getData()+" ");
        preTraversal(binaryTree.getLeft());
        preTraversal(binaryTree.getRight());
    }

    public BinaryTree getBinaryTree(){
        BinaryTree root = new BinaryTree(1);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        BinaryTree node4 = new BinaryTree(4);
        BinaryTree node5 = new BinaryTree(5);
        BinaryTree node6 = new BinaryTree(6);
        BinaryTree node7 = new BinaryTree(7);

        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);


        return root;
    }
}
