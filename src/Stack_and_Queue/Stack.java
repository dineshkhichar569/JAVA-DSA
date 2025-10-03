void main() {
    IO.println("Hello Sunny");

    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);

    IO.println(stack);

    IO.println(stack.pop());
    IO.println(stack.pop());
    IO.println(stack.pop());
    IO.println(stack.pop());
    IO.println(stack.pop());

    IO.println(stack);

}

