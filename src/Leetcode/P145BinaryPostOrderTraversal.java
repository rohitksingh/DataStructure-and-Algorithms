package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class P145BinaryPostOrderTraversal {

    List<Integer> list = new ArrayList();

    public List<Integer> postorderTraversal(TreeNode root) {

        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }

        return list;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
