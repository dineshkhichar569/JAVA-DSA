package Linked_List;


public class LC_237_Delete_Node_in_a_Linked_List {

    private Node head;
    private Node tail;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
        }
    }

    public int deleteValue(Node node){

        int val = node.value;

        node.value = node.next.value;
        node.next = node.next.next;

        return val;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public static void main(String[] args) {
        LC_237_Delete_Node_in_a_Linked_List list = new LC_237_Delete_Node_in_a_Linked_List();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);

        list.insertLast(100);

        list.display();

        System.out.println(list.deleteValue(list.find(30)));
        list.display();


    }
}
