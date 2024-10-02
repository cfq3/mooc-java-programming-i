import java.util.ArrayList;

public class Stack {

    // Instance variable
    private ArrayList<String> stackList;

    // Constructor
    public Stack() {
        this.stackList = new ArrayList<String>();
    }

    // Method to check if stack is empty
    public boolean isEmpty() {
        boolean isEmpty = false;
        if (this.stackList.size() == 0) {
            isEmpty = true;
        }
        return isEmpty;
    }

    // Method to add a value to the stack
    public void add(String value) {
        this.stackList.add(value);
    }

    // Method to return the stack as a list of values
    public ArrayList<String> values() {
        return this.stackList;
    }

    public String take() {
        return this.stackList.remove(this.stackList.size() - 1);
    }
}