package Tree;
import java.util.Scanner;
public class BinaryTree {
//    constructor
    public BinaryTree() {

    }
    private class Node {
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

//    insert element
    public void populate(Scanner scanner){
        System.out.print("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left to the Node: " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left value: " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right to the Node: " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right value: " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

//    Display
    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
    }

}
