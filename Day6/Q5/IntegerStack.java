package Day6.Q5;
import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack;

    // Constructor
    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(int element) {
        stack.push(element);
        System.out.println("Pushed element: " + element);
    }

    // Method to pop an element from the stack
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Return a sentinel value indicating the stack is empty
        } else {
            int element = stack.pop();
            System.out.println("Popped element: " + element);
            return element;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();

        // Pushing elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Popping elements from the stack
        integerStack.pop();
        integerStack.pop();

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + integerStack.isEmpty());

        // Popping the last element
        integerStack.pop();

        // Checking if the stack is empty again
        System.out.println("Is the stack empty? " + integerStack.isEmpty());
    }
}
