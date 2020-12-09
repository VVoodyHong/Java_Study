package Interface;

interface ContainerInterface {
    public int Size();
    public boolean IsEmpty();
    public boolean IsFull();
    public void Element(int x);
    public void Push(int x);
    public void Pop();
}

class MyStack implements ContainerInterface {

    int size;
    int top;
    int[] stackArray;
    
    MyStack(int size) {
        this.size = size;
        top = 0;
        stackArray= new int[size];
    }

    public int Size() { return top + 1;}

    public boolean IsEmpty() { return (top == 0);}

    public boolean IsFull() { return (size == top);}
    
    @Override
    public void Element(int x) {
        if ( x > top ) {
            System.out.println("Invalid index");
            return ; 
        }
        System.out.println(stackArray[x -1]);
    }
    
    @Override
    public void Push(int x) {
        if ( IsFull() ) {
            System.out.println("Stack is full.");
            return;
        }
        stackArray[top] = x;
        top++;
    }
    
    @Override
    public void Pop() {
        if ( IsEmpty() ) {
            System.out.println("Stack is empty.");
            return;
        }
        stackArray[top] = 0;
        top--;
    }
}


class MyQueue implements ContainerInterface {

    int size;
    int top;
    int[] queueArray;
    
    MyQueue(int size) {
        this.size = size;
        top = 0;
        queueArray= new int[size];
    }

    public int Size() { return top + 1;}

    public boolean IsEmpty() { return (top == 0);}

    public boolean IsFull() { return (size == top);}
    
    @Override
    public void Element(int x) {
        if ( x > top ) {
            System.out.println("Invalid index");
            return;
        }
        System.out.println(queueArray[x - 1]);
    }
    
    @Override
    public void Push(int x) {
        if ( IsFull() ) {
            System.out.println("queue is full.");
            return;
        }
        queueArray[top] = x;
        top++;
    }
    
    @Override
    public void Pop() {
        if ( IsEmpty() ) {
            System.out.println("Stack is empty.");
            return;
        }

        for ( int i = 0; i < top - 1; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        queueArray[top - 1] = 0;
        top--;
    }
}

public class InterfaceStackQueue {
    public static void main(String[] args) {
        MyStack A = new MyStack(5);
        
        A.Push(1);
        A.Push(2);
        A.Push(3);
        A.Pop();

        A.Element(1);
        A.Element(2);
        A.Element(3);

        MyQueue B = new MyQueue(5);
        
        B.Push(1);
        B.Push(2);
        B.Push(3);
        B.Pop();

        B.Element(1);
        B.Element(2);
        B.Element(3);
    }
}