package Tree;

public class BSTTest {

    public static void main(String[] args) {

        BSTTest bstTest = new BSTTest();
        BinaryTree binaryTree = bstTest.addElement(bstTest.getBST(), 24);
        new TreeTest().inOrderTraversal(binaryTree);

    }


    /**
     *                              Add element in a BST
     * ----------------------------------------------------------------------------
     * First check if the tree is empty return new element.
     * Check if the current node is a leaf
     *     - YES: - Check if the new element is smaller
     *                  - YES: add the new element in the left
     *                  - NO: add the new element in the right
     *     - NO:  - Check if the new element is smaller
     *                  - YES: recursively call method with left node
     *                  - NO:  recursively call method with right node
     */
    public BinaryTree addElement(BinaryTree binaryTree, int element){

        if(binaryTree==null)
            return new BinaryTree(element);

        if(binaryTree.getLeft()==null && binaryTree.getRight()==null){
            if(element<binaryTree.getData()){
                binaryTree.setLeft(new BinaryTree(element));
            }else{
                binaryTree.setRight(new BinaryTree(element));
            }
        }else{
            if(element<binaryTree.getData()){
                addElement(binaryTree.getLeft(), element);
            }else{
                addElement(binaryTree.getRight(), element);
            }
        }

        return binaryTree;
    }


    /**
     *                             Delete element in a BST
     * ----------------------------------------------------------------------------
     */
    public BinaryTree deleteElement(BinaryTree binaryTree, int element){
        if(binaryTree==null)
            return binaryTree;

        BinaryTree parent = binaryTree;

        if(element<binaryTree.getData() && binaryTree.getLeft()!=null){
            deleteElement(binaryTree.getLeft(), element);
        }else if(element>binaryTree.getData() && binaryTree.getLeft()!=null){
            deleteElement(binaryTree.getRight(), element);
        }else{
            
        }
        return binaryTree;
    }

    //Check if a tree is a BST
    public boolean isBST(BinaryTree binaryTree){

        boolean isBST = true;

        if(binaryTree!=null){
            if(binaryTree.getLeft()!=null){
                if(binaryTree.getLeft().getData()>binaryTree.getData()){
                    return isBST = false;
                }else {
                    isBST = isBST(binaryTree.getLeft());
                }
            }

            if(binaryTree.getRight()!=null){
                if(binaryTree.getRight().getData()<binaryTree.getData()){
                    return isBST = false;
                }else {
                    isBST = isBST(binaryTree.getRight());
                }
            }
        }

        return isBST;
    }


    // A sample BST
    public BinaryTree getBST(){
        BinaryTree root = new BinaryTree(40);
        BinaryTree node2 = new BinaryTree(20);
        BinaryTree node3 = new BinaryTree(30);
        BinaryTree node1 = new BinaryTree(10);
        BinaryTree node5 = new BinaryTree(50);
        BinaryTree node6 = new BinaryTree(60);
        BinaryTree node7 = new BinaryTree(70);
        BinaryTree node8 = new BinaryTree(80);

        root.setLeft(node2);
        root.setRight(node6);
        node2.setLeft(node1);
        node2.setRight(node3);
        node6.setLeft(node5);
        node6.setRight(node7);


        return root;
    }
}
