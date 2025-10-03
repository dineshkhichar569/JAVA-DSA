static void main() {
    Queue<Integer> que = new LinkedList<>();

    que.add(10);
    que.add(20);
    que.add(30);
    que.add(40);
    que.add(50);

    IO.println(que);
    IO.println(que.poll());
    IO.println(que.remove());
}