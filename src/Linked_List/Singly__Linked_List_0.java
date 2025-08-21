package Linked_List;

public class Singly__Linked_List_0 {

    private Node head;
    private Node tail;
    private int size;

    /// constructor of LL
    public Singly__Linked_List_0(){
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

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
        } else if (index == size) {
            insertLast(val);
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }
    }


    public int deletionFirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deletionLast(){
        if(size <= 1){
            return deletionFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deletionFirst();
        }
        if(index == size - 1){
            return deletionLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public int deleteValue(int value){
        Node prev = findPrevious(value);
        int d = prev.value;
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }


    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value) {
                return node;
            }
                node = node.next;
        }
        return null;
    }

    public Node findPrevious(int value){
        Node prev = null;
        Node node = head;

        while(node != null){
            if(node.value == value){
                return prev;
            }
            prev = node;
            node = node.next;
        }
        return null;
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
        private  Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        Singly__Linked_List_0 list = new Singly__Linked_List_0();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);

        list.insertLast(100);

        list.insert(90, 3);

        list.display();

        System.out.println(list.deletionFirst());
        list.display();

        System.out.println(list.deletionLast());
        list.display();

        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(1);
        list.insertLast(9);

        list.display();

        System.out.println(list.delete(2));
        list.display();

    }
}





