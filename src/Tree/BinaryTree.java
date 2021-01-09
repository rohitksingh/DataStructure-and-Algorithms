package Tree;

public class BinaryTree {

    private int data;
    private BinaryTree left,right;

    public BinaryTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData(){
        return data;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }
}
