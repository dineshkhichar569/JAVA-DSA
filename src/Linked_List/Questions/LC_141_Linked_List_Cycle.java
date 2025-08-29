package Linked_List.Questions;

public class LC_141_Linked_List_Cycle {
    private Node head;
    private Node tail;
    private int size;

    /// constructor of LL
    public LC_141_Linked_List_Cycle(){
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void cycle(int pos){
        if(pos < 0) return;
        tail.next = get(pos);
    }

    public boolean isCycle(){
        if(tail.next == null){
            return false;
        }else {
            return true;
        }
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        int count = 0;
        while(temp != null && count < size){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
            count++;
        }
        if(temp == null) {
            System.out.println("null");
        }else {
            System.out.println("Cycle....");
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        LC_141_Linked_List_Cycle list = new LC_141_Linked_List_Cycle();

        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(0);
        list.insertLast(-4);
        list.display();

        list.cycle(-1);
        list.display();

        System.out.println(list.isCycle());

    }
}
