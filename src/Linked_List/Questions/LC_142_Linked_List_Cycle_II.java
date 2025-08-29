package Linked_List.Questions;

public class LC_142_Linked_List_Cycle_II {
    private Node head;
    private Node tail;
    private int size;

    /// constructor of LL
    public LC_142_Linked_List_Cycle_II(){
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
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


//    public boolean isCycle(){
//        Node fast = head;
//        Node slow = head;
//
//        while(fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                return true;
//            }
//        }
//        return false;
//    }
    public int startingPoint(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                slow = head;
                while (fast != null){
                    if(fast == slow){
                        return fast.value;
                    }
                    slow = slow.next;
                    fast = fast.next;
                }
            }
        }
        return -1;
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
        LC_142_Linked_List_Cycle_II list = new LC_142_Linked_List_Cycle_II();

        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(0);
        list.insertLast(-4);
        list.display();
        list.cycle(1);
        list.display();

//        System.out.println(list.isCycle());
        System.out.println(list.startingPoint());

    }
}
