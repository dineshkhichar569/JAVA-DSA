static void main() {
    Deque<Integer> d = new ArrayDeque<>();
    d.addFirst(10);
    d.addFirst(20);
    d.addFirst(30);
    d.addLast(50);
    d.addLast(100);

    System.out.println(d);
}
