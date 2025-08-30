package LinkedList;
//import java.util.*;

public class Main {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        // Append values at the end
        list.Append(10);
        list.Append(20);
        list.Append(30);
        list.getList(); // Output: 10->20->30->null

        System.out.println();

        // Prepend value at the start
        list.Prepend(5);
        list.getList(); // Output: 5->10->20->30->null

        System.out.println();

        // Insert at index
        list.insert(2, 15);
        list.getList(); // Output: 5->10->15->20->30->null

        System.out.println();

        // Change value
        list.set(2, 50);
        list.getList(); // Output: 5->10->50->20->30->null

        System.out.println();

        // Remove first element
        list.removeFirst();
        list.getList(); // Output: 10->50->20->30->null

        System.out.println();

        // Remove last element
        list.removeLast();
        list.getList(); // Output: 10->50->20->null

        System.out.println();

        // Remove element at index
        list.removes(1);
        list.getList(); // Output: 10->20->null

        System.out.println();

        // Reverse list
        list.reverse(); // Output: 20->10->null
    }
}
