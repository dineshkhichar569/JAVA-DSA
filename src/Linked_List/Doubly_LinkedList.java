package Linked_List;

public class Doubly_LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Doubly_LinkedList(){
        this.size = 0;
    }


    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }

        head = node;

        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);

        if(head == null){
          //  insertFirst(value);
            ////// or //////
            node.prev = null;
            head = node;
            return;
        }

        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        node.next = null;
        last.next = node;
        node.prev = last;

        size++;
    }

    public void insert(int val, int index){

        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next, temp.prev);

        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
        size++;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("null");

        System.out.println("Printing in Reverse.....");

        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Start");

    }


    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        Doubly_LinkedList list = new Doubly_LinkedList();

        list.insertFirst(4);
        list.insertFirst(7);
        list.insertFirst(3);
        list.insertFirst(9);
        list.insertFirst(1);

        list.insertLast(100);

        list.insert(333, 5);

        list.display();
    }
}
