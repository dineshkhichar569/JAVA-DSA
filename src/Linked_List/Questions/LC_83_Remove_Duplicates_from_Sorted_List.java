package Linked_List.Questions;

public class LC_83_Remove_Duplicates_from_Sorted_List {
    private ListNode head;
    int size;

    public LC_83_Remove_Duplicates_from_Sorted_List(){
        this.size = 0;
    }

    public void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    public void deleteDuplicates() {
        ListNode node = head;
         while(node.next != null){
             if(node.val == node.next.val){
                 node.next = node.next.next;
             }else {
                 node = node.next;
             }
         }
    }


    public void display(){
        ListNode node = head;
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){ this.val = val; };
        ListNode(int val, ListNode Next){
            this.val = val;
            this.next = next;
        };
    }

    public static void main(String[] args) {
        LC_83_Remove_Duplicates_from_Sorted_List list = new LC_83_Remove_Duplicates_from_Sorted_List();

        list.insertFirst(4);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);

        list.display();

        list.deleteDuplicates();
        list.display();
    }
}
