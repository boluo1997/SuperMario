package cn;

import java.util.ArrayList;
import java.util.List;

public class Test17_BinaryTree {
    public static void main(String[] args) {

    }

    //返回二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        return list;
    }

    public static void helper(TreeNode root,List<Integer> list){
        if(root == null){return ;}
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}