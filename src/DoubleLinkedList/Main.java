package DoubleLinkedList;

public class Main {
    public static void main(String[] args){
        doubleLinkedList dlist = new doubleLinkedList(10);
        System.out.println(dlist.get(0));

        dlist.Append(1);
        dlist.Append(2);
        dlist.Append(3);
        dlist.insert(1,9);
        dlist.set(2,5);
        dlist.removeFirst();

        dlist.getList();


    }
}
