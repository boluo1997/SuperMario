package cn;

import java.util.ArrayList;
import java.util.List;

//单值二叉树
public class Test18_Single_BinaryTree {
    public static void main(String[] args) {

    }

    public boolean isUnivalTree(TreeNode root) {
        List<Integer> list = preorderTraversal(root);
        Object[] nums = list.toArray();

        boolean flag = true;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] != nums[j]){
                    flag = false;
                }
            }
        }

        return flag;

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
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

