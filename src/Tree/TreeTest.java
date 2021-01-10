package Tree;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTest {

    public static void main(String[] args){

        TreeTest treeTest = new TreeTest();
        //treeTest.inOrderTraversal(treeTest.getBST());
        System.out.println(treeTest.isBST(treeTest.getBST()));
//        treeTest.printReverseLevels(treeTest.getBinaryTree());
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


    //Inorder traversal + a Stack used to reverse the order
    public void printReverseLevels(BinaryTree binaryTree){

        if(binaryTree==null)
            return;

        Queue<BinaryTree> queue = new LinkedList<>();
        Stack<BinaryTree> stack = new Stack<>();
        queue.add(binaryTree);

        while (!queue.isEmpty()){

            BinaryTree node = queue.remove();
            stack.push(node);

            if(node.getLeft()!=null){
                queue.add(node.getLeft());
            }
            if(node.getRight()!=null){
                queue.add(node.getRight());
            }

        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop().getData()+" ");
        }
    }



    //Level order traversal + find the first leaf and add the new element there.
    //This could take lonf if the tree is full binary tree and num of levels are more
    //A faster approach would be a DFS to find the first node
    public BinaryTree addElement(BinaryTree binaryTree, int element){

        if(binaryTree==null){
            return new BinaryTree(element);
        }

        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(binaryTree);
        boolean leafFound = false;
        while(!queue.isEmpty() && !leafFound){
            BinaryTree node = queue.remove();
            if(node.getLeft()==null && node.getRight()==null){
                leafFound = true;
                node.setLeft(new BinaryTree(element));
            }else{
                if(node.getLeft()!=null){
                    queue.add(node.getLeft());
                }
                if(node.getRight()!=null){
                    queue.add(node.getRight());
                }
            }
        }

        return binaryTree;
    }

    public boolean search(BinaryTree binaryTree, int number){

        if(binaryTree==null)
            return false;

        if(binaryTree.getData()==number){
            return true;
        }else {
            return search(binaryTree.getLeft(), number) || search(binaryTree.getRight(), number);
        }

    }

    public boolean searchIterative(BinaryTree binaryTree, int number){

        if(binaryTree==null)
            return false;

        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(binaryTree);

        while(!queue.isEmpty()){
            BinaryTree node = queue.remove();
            if(number==node.getData()){
                return true;
            }else {
                if(node.getLeft()!=null){
                    queue.add(node.getLeft());
                }
                if(node.getRight()!=null){
                    queue.add(node.getRight());
                }
            }
        }

        return false;


    }



    //Q - Find max element in Binary Tree
    //Recursice function.
    //Key things
    //  - Traverse the tree recursively
    //  - compare parent node with children
    public int getMax(BinaryTree binaryTree){

        if(binaryTree==null)
            return Integer.MIN_VALUE;

        int result = max(binaryTree.getData(), getMax(binaryTree.getLeft()), getMax(binaryTree.getRight()));

        return result;
    }

    public int max(int a, int b, int c){
        if(a>=b && a>=c)
            return a;
        if(b>=c && b>=a)
            return b;
        return c;
    }

    public int getMaxIterative(BinaryTree binaryTree){

        if(binaryTree==null)
            return Integer.MIN_VALUE;

        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(binaryTree);
        int result = Integer.MIN_VALUE;

        while(!queue.isEmpty()){
            BinaryTree node = queue.remove();

            if(result<node.getData())
                result = node.getData();

            result = (result < node.getData()) ? node.getData() : result ;

            if(node.getLeft()!=null){
                queue.add(node.getLeft());
            }
            if(node.getRight()!=null){
                queue.add(node.getRight());
            }
        }

        return result;
    }


    //Recursive algorithms
    public void preOrderTraversal(BinaryTree binaryTree){

        if(binaryTree!=null){
            System.out.print(binaryTree.getData()+" ");
            preOrderTraversal(binaryTree.getLeft());
            preOrderTraversal(binaryTree.getRight());
        }
    }

    public void postOrderTraversal(BinaryTree binaryTree){

        if(binaryTree!=null){
            postOrderTraversal(binaryTree.getLeft());
            postOrderTraversal(binaryTree.getRight());
            System.out.print(binaryTree.getData()+" ");
        }

    }

    public void inOrderTraversal(BinaryTree binaryTree){

        if(binaryTree!=null){
            inOrderTraversal(binaryTree.getLeft());
            System.out.print(binaryTree.getData()+" ");
            inOrderTraversal(binaryTree.getRight());
        }

    }


    public void preOrderIterative(BinaryTree binaryTree){

        Stack<BinaryTree> stack = new Stack<>();
        if(binaryTree!=null){
            stack.push(binaryTree);
        }

        while(!stack.empty()){
            BinaryTree node = stack.pop();
            System.out.print(node.getData()+" ");
            if(node.getRight()!=null){
                stack.push(node.getRight());
            }
            if(node.getLeft()!=null){
                stack.push(node.getLeft());
            }
        }

    }


    //Level order traversal
    //It is same as Preorder traversal. Only difference is it uses Queue instead of Stack.
    //Also the left element is added first and then right.
    public void levelOrderTraversal(BinaryTree binaryTree){

        if(binaryTree==null)
            return;

        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(binaryTree);

        while(!queue.isEmpty()){
            BinaryTree node = queue.remove();
            System.out.println(node.getData());
            if(node.getLeft()!=null){
                queue.add(node.getLeft());
            }
            if(node.getRight()!=null){
                queue.add(node.getRight());
            }
        }


    }



    public void inOrderIterative(BinaryTree binaryTree){

        if(binaryTree==null)
            return;

        Stack<BinaryTree> stack = new Stack<>();
        stack.push(binaryTree);

        while(!stack.empty()){



        }

    }

    public void postOrderIterative(BinaryTree binaryTree){

        if(binaryTree==null)
            return;

        Stack<BinaryTree> stack = new Stack<>();
        stack.push(binaryTree);

        while (!stack.empty()){
            BinaryTree node = stack.peek();
            System.out.println(node.getData());
            if(node.getLeft()==null && node.getRight()==null){
                System.out.println("Popping "+stack.pop().getData()+" ");
            }else{
                if(node.getRight()!=null){
                    //System.out.print("Pushing "+node.getRight().getData());
                    stack.push(node.getRight());
                }

                if(node.getLeft()!=null){
                    //System.out.print("Pushing "+node.getLeft().getData());
                    stack.push(node.getLeft());
                }

            }
        }

    }



    //A sample binary tree
    public BinaryTree getBinaryTree(){
        BinaryTree root = new BinaryTree(1);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        BinaryTree node4 = new BinaryTree(4);
        BinaryTree node5 = new BinaryTree(5);
        BinaryTree node6 = new BinaryTree(6);
        BinaryTree node7 = new BinaryTree(7);
        BinaryTree node8 = new BinaryTree(8);

        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);
        node4.setLeft(node8);


        return root;
    }

    public BinaryTree getBST(){
        BinaryTree root = new BinaryTree(4);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        BinaryTree node1 = new BinaryTree(1);
        BinaryTree node5 = new BinaryTree(5);
        BinaryTree node6 = new BinaryTree(6);
        BinaryTree node7 = new BinaryTree(7);
        BinaryTree node8 = new BinaryTree(8);

        root.setLeft(node2);
        root.setRight(node6);
        node2.setLeft(node1);
        node2.setRight(node3);
        node6.setLeft(node5);
        node6.setRight(node7);


        return root;
    }
}
