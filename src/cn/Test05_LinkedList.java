package cn;

public class Test05_LinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("a");
        list.add("f");
        list.add("g");
        list.add(0, "1");
        list.add(4, "2");
        list.add(2, "3");
        list.delete(0);
        list.delete(4);

        System.out.println(list);
    }
}

class LinkedList{

    int size = 0;
    Node first;
    Node last;

    public void isout(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("index"+index);
        }
    }

    //根据下标找到指定的节点
    public Node getNode(int index){
        Node no = this.first;
        for(int i = 0;i<index;i++){
            no = no.next;
        }
        return no;
    }

    //添加节点
    public void add(String str){
        Node node = new Node(str,null,null);

        if(size == 0){
            this.first = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
        }
        this.last = node;
        size++;
    }

    //添加节点
    public void add(int index,String str){
        isout(index);
        Node node = new Node(str,null,null);

        //判断在哪个位置进行插入
        if(index == 0){
            this.first.prev = node;
            node.next = this.first;
            this.first = node;
        }else if(index == size){
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }else{
            Node no = getNode(index);   //先查到index对应下标的节点
            no.prev.next = node;
            node.prev = no.prev;
            no.prev = node;
            node.next = no;
        }
        size++;
    }

    //根据下标进行删除
    public void delete(int index){
        isout(index);

        if(index == 0){
            this.first = this.first.next;
            this.first.prev = null;
        }else if(index == size-1){
            this.last = this.last.prev;
            this.last.next = null;
        }else{
            Node no = getNode(index);
            no.prev.next = no.next;
            no.next.prev = no.prev;
        }
        size--;
    }

    //查找元素第一次出现的下标
    public int indexOf(String str){
        Node no = this.first;
        for(int i=0;i<size;i++){
            if(str == no.data || str != null && str.equals(no.data)){
                return i;
            }
            no = no.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        //
        StringBuilder sb=new StringBuilder("[");
        //依次拼接真实值
        //遍历节点
        Node no=this.first;
        for(int i=0;i<size;i++){
            sb.append(no.data).append(", ");
            no=no.next;
        }

        //转换字符串
        String str=sb.toString();

        //判断size是否为0
        if(size>0)
            str=str.substring(0, str.length()-2);

        //返回
        return str+="]";
    }
}

class Node{

    String data;
    Node prev;
    Node next;

    public Node(String data,Node prev,Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
