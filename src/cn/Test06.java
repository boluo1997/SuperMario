package cn;

public class Test06 {

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {

        int size = 0;
        ListNode no = head;
        while(no != null){
            ++size;
            no = no.next;
        }

        int i = 0;
        no = head;
        while(i<size/2){
            ++i;
            no = no.next;
        }
        return no;
    }


}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}