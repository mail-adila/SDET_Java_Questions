/*
 * Program to implement a stack using arrays:
 * Write a Java program to implement a stack data structure using arrays, 
 * along with basic operations like push, pop, and peek.
 * 
 */

public class Stack 
{
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
        System.out.println(item + " pushed into the stack");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedItem = stack[top--];
        System.out.println(poppedItem + " popped from the stack");
        return poppedItem;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top element of stack: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.pop();
        stack.pop(); // Pop additional item to demonstrate underflow condition
    }
}
