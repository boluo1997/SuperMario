package cn;

import java.util.LinkedList;
import java.util.Queue;

public class Test08_LinkedBinaryTree {
    public static void main(String[] args) {

        Node3 node5 = new Node3(5, null, null);
        Node3 node4 = new Node3(4, null, node5);

        Node3 node3 = new Node3(3, null, null);
        Node3 node7 = new Node3(7, null, null);
        Node3 node6 = new Node3(6, null, node7);

        Node3 node2 = new Node3(2, node3, node6);
        Node3 node1 = new Node3(1, node4, node2);

        LinkedBinaryTree btree = new LinkedBinaryTree(node1);

        System.out.println("二叉树节点个数" + btree.size(node1));
        System.out.println("二叉树高度" + btree.height(node1));
        System.out.println("寻找值" + btree.findKey(3, node1));
        //btree.preOrderTraverse();
        System.out.println("先序遍历");
        btree.preOrderTraverse(node1);
        System.out.println("中序遍历");
        //btree.inOrderTraverse(node1);
        System.out.println("后序遍历");
        //btree.postOrderTraverse(node1);
        System.out.println("层遍历");
        btree.levelOrderByStack();

    }

}
class LinkedBinaryTree {
    Node3 root;

    public LinkedBinaryTree(Node3 root){
        this.root = root;
    }

    //二叉树节点个数
    public int size(Node3 root){
        if(root == null){
            return 0;
        }else {
            int nl = size(root.leftChild);
            int nr = size(root.rightChild);
            return nl+nr+1;
        }
    }

    //二叉树高度
    public int height(Node3 root){
        if(root == null){
            return 0;
        }else {
            int nl = height(root.leftChild);
            int nr = height(root.rightChild);
            return nl > nr ? nl+1 : nr+1;
        }
    }

    //在二叉树中寻找一个值
    public Node3 findKey(Object value,Node3 root){
        if(root == null){
            return null;
        }else if(root != null && root.value == value){
            return root;
        }else {
            Node3 nl = findKey(value,root.leftChild);
            Node3 nr = findKey(value,root.rightChild);

            if(nl != null && nl.value == value){
                return nl;
            }else if(nr != null && nr.value == value){
                return nr;
            }else {
                return null;
            }
        }
    }

    //二叉树先序遍历
    public void preOrderTraverse(Node3 root){
        if(root != null){
            System.out.println(root.value+" ");
            this.preOrderTraverse(root.leftChild);
            this.preOrderTraverse(root.rightChild);
        }
    }

    //按照层次遍历(借助栈)
    public void levelOrderByStack(){
        if(root == null){
            return ;
        }

        Queue<Node3> queue = new LinkedList<>();
        queue.add(root);

        while(queue.size() != 0){       //只要栈里面元素的个数不为0
            //遍历栈中的元素
            for(int i=0;i<queue.size();i++){
                Node3 temp = queue.poll();  //吧栈顶的元素取出
                System.out.println(temp.value+" ");

                //然后载遍历栈顶元素的左子树、右子树
                if(temp.leftChild != null){
                    queue.add(temp.leftChild);
                }
                if(temp.rightChild != null){
                    queue.add(temp.rightChild);
                }
            }
        }
    }
}

class Node3 {

    Object value;
    Node3 leftChild;
    Node3 rightChild;

    public Node3(Object value) {
        this.value = value;
    }

    public Node3(Object value, Node3 leftChild, Node3 rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node3{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}



