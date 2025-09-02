package DoubleLinkedList;

public class doubleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public doubleLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail =  newNode;
        length = 1;
    }

//------------------------------------------------------------------------------
    public void getList(){
        if(length == 0){
            System.out.print("no node found");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
        }
    }

//--------------------------------------------------------------------------------
    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index ; i++){
            temp = temp.next;
        }
        return temp;
    }

//-----------------------------------------------------------------------------------
    public void Append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else {
            Node temp = tail;
            temp.next = newNode;
            newNode.prev = temp;
        }
        tail = newNode;
        length++;
    }

//----------------------------------------------------------------------------------------
    public void prepend(int value){
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        length++;
    }

//------------------------------------------------------------------------------------------
    public void insert(int index , int value){
        if(index == 0){
            Append(value);
        }
        else if(index == length){
            prepend(value);
        }
        else{
            Node temp = get(index-1);
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next.prev = newNode;
            newNode.prev = temp;
            temp.next = newNode;
            length++;
        }
    }

//-------------------------------------------------------------------------
    public void set(int index , int value){
        Node temp = get(index); // get node at index
        if(temp != null){
            temp.value = value; // update value
        }
    }

//---------------------------------------------------------------------------
    public void removeFirst(){
        if(head == tail){
            head = null;
            tail = null;
        }
        else {
            Node temp = head;
            head = temp.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
    }

//-------------------------------------------------------------------------------
    public void removeLast(){
        if(length == 1){
            head = null;
            tail = null;
        }
        else {
            Node temp = tail;
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
    }
}
