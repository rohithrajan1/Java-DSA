package Stack;

public class stack {
    private Node top;
    private int height;

    public stack(int value){
        top = new Node(value);
        height = 1;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
            System.out.println("v");
        }
    }
//  ----------------------------------------------------------
//    methods for stack

    public Node getTop(){
        return top;
    }

//    ------------------------------------------------------
    public void push(int value){
        Node newNode = new Node(value);
        if(top == null){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

//    -----------------------------------------------------
    public Node pop(){
        Node temp = top;
        if(height == 0){
            return null;
        }
        else{
            top = temp.next;
            temp.next = null;
            height--;
            return temp;
        }
    }
}
