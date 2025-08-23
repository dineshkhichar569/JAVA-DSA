package Linked_List;

public class Circular_LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void Circular_LinkedList(int size){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void insertFirstLast(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

        size++;
    }

    public void insert(int index, int value){
        if(size == 0){
            insertFirstLast(value);
            return;
        }
        Node node = new Node(value);
        Node prev = get(index - 1);

        node.next = prev.next;
        prev.next = node;

        size++;
    }


    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node node = head;
        if(head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while (node != head);  // stop when back to head
            System.out.println("null");
        }
    }
    private class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }

        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        Circular_LinkedList list = new Circular_LinkedList();

        list.insertFirstLast(10);
        list.insertFirstLast(20);
        list.insertFirstLast(30);
        list.insertFirstLast(40);
        list.insertFirstLast(50);

        list.insert(2, 111);

        list.display();
    }
}
