package LinkedList; // Package name to organize classes

// Node class represents a single element in the linked list
public class Node {

    // The value stored in this node
    int value;

    // Reference (pointer) to the next node in the list
    Node next;

    // Constructor to create a node with a given value
    // By default, 'next' will be null when a node is created
    public Node(int value){
        this.value = value;
    }
}
