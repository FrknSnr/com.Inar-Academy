package chapters.chapter13.Exercise08;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        MyStack myStack = new MyStack();
        myStack.push(6);
        MyStack myStack1 = myStack;
        myStack.push(7);
        MyStack myStack2 = (MyStack) myStack.clone();

        myStack.pop();

        System.out.println("First : " + myStack + "\nThe same referenced : " + myStack1 + "\nCloned : " + myStack2);
    }
}
