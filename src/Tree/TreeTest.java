package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTest {

    public static void main(String[] args){

        TreeTest treeTest = new TreeTest();
        System.out.println(treeTest.searchIterative(treeTest.getBinaryTree(), 5));
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

        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);


        return root;
    }
}
