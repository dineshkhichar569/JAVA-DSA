package Linked_List.Questions;

public class LL_876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int index = 0;
        while(head != null){
            head = head.next;
            index++;
        }
        int mid = index/2;
        for(int i = 0; i < mid; i++){
            node = node.next;
        }
        return node;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;
        }
    }
}
