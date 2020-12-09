package Abstract;

abstract class StackClass {
    int size;
    int top;
    
    public int Size() { return top + 1;}
    public boolean IsEmpty() { return (top == 0);}
    public boolean IsFull() { return (size == top);}
    abstract public void Element(int x);
    abstract public void Push(int x);
    abstract public void Pop();
}

class MyStack extends StackClass {

    int[] stackArray;
    
    MyStack(int size) {
        this.size = size;
        top = 0;
        stackArray= new int[size];
    }
    
    @Override
    public void Element(int x) {
        if ( x > top ) {
            System.out.println("Invalid index");
            return; 
        }
        System.out.println(stackArray[x - 1]);
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

public class AbstractStack {

    public static void main(String[] args) {
        MyStack A = new MyStack(5);
        
        A.Push(1);
        A.Push(2);

        A.Element(1);
        A.Element(2);
        A.Element(3);
    }
}