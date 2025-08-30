package LinkedList; // package name for organization

// Our custom Linked List class
public class linkedlist {

    // head points to the first node of the linked list
    private Node head;

    // tail points to the last node of the linked list
    private Node tail;

    // keeps track of the number of nodes
    private int length;

    //------------------------------------constructors---------------------------------------------------------------------
    // Constructor is commented out, but if you uncomment it,
    // you can create a linked list with the first value directly.
    /*
    public linkedlist(int value){
        Node newNode = new Node(value);
        head = newNode;   // head points to first node
        tail = newNode;   // tail also points to same node (since only one node exists)
        length = 1;       // list length is 1
    }
    */

    //---------------------------Getting a single node using index-------------------------------------------
    public Node get(int index){
        if (index < 0 || index >= length) { // index out of bounds check
            return null;
        }

        Node temp = head; // start from head
        for(int i = 0; i < index; i++){ // traverse until index
            temp = temp.next;
        }
        return temp; // return the node found
    }

    //--------------------------------Printing the linked list----------------------------------------
    public void getList(){
        Node temp = head; // start from head
        while(temp != null){ // loop until end
            System.out.print(temp.value + "->"); // print value
            temp = temp.next; // move to next node
        }
        System.out.print("null"); // mark end of list
    }

    //------------------------------Adding a node at the end-------------------------------------------
    public void Append(int value){
        Node newNode = new Node(value); // create new node
        if(length == 0) { // if list empty
            head = newNode; // head points to new node
        } else {
            tail.next = newNode; // old tail points to new node
        }
        tail = newNode; // update tail
        length++; // increase length
    }

    //---------------------------------Adding a value at the front--------------------------------------------
    public void Prepend(int value){
        Node newNode = new Node(value); // create new node
        if(length == 0){ // if empty
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head; // point new node to old head
            head = newNode; // head updated
        }
        length++;
    }

    //------------------------------------ inserting a value in the given index----------------------------------------------
    public boolean insert(int index , int value){
        // invalid index case
        if(index < 0 || index > length){return false;}

        if(index == 0){ // insert at front
            Prepend(value);
            return true;
        }
        if(index == length){ // insert at end
            Append(value);
            return true;
        }

        // insert in middle
        Node newNode = new Node(value);
        Node temp = get(index - 1); // node before index
        newNode.next = temp.next; // link new node to next node
        temp.next = newNode; // link previous node to new node
        length++;
        return true;
    }

    //----------------------------------Changing a value in a node-----------------------------------------------
    public Node set(int index , int value){
        Node temp = get(index); // get node at index
        if(temp != null){
            temp.value = value; // update value
        }
        return temp;
    }

    //-------------------------------Removing a node from the front--------------------------------------------------
    public boolean removeFirst(){
        if(head == null){ // empty list
            return false;
        }
        else{
            Node temp = head; // store current head
            head = temp.next; // move head forward
            temp.next = null; // disconnect old head
            length--;
            if(length == 0){ // if list becomes empty
                tail = null;
            }
        }
        return true;
    }

    //----------------------------------Removing a node from the end--------------------------------------------
    public boolean removeLast(){
        if(head == null){ // empty list
            return false;
        }

        Node temp = head;
        Node pre = head;

        while(temp.next != null){ // traverse till last
            pre = temp;
            temp = temp.next;
        }

        tail = pre; // tail updated
        pre.next = null; // last node removed
        length--;

        if(length == 0){ // if list becomes empty
            tail = null;
            head = null;
        }
        return  true;
    }

    //---------------------------------Removing a node from the given index----------------------------------------------
    public boolean removes(int index) {

        if(index < 0 || index >= length){ // invalid index
            return false;
        }

        if(index == 0){ // remove from front
            return removeFirst();
        }
        else if(index == length-1){ // remove from last
            return removeLast();
        }

        // remove from middle
        Node pre = get(index-1); // node before the one to delete
        Node temp = pre.next; // node to be deleted

        pre.next = temp.next; // bypass temp
        temp.next = null; // disconnect deleted node
        length--;
        return true;
    }

    //---------------------------Reversing a linked list------------------------------------------------
    public void reverse(){
        Node temp = head;
        Node before = null;

        while(temp != null){ // iterate through list
            Node after = temp.next; // store next
            temp.next = before; // reverse link
            before = temp; // move before forward
            temp = after; // move current forward
        }

        // print reversed list
        Node new_temp = before;
        while(new_temp != null){
            System.out.print(new_temp.value + "->");
            new_temp = new_temp.next;
        }
        System.out.print("null");
    }
}
