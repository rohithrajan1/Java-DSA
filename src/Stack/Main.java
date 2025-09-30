package Stack;

public class Main {
    public static void main(String[] args){
        stack newstack = new stack(1);

//        System.out.println("Head :" + newstack.getTop().value);
        newstack.push(10);
        newstack.push(11);
        newstack.push(12);
        newstack.printStack();
        System.out.println("-----------------------------------");
        newstack.pop();
        newstack.printStack();
    }
}
