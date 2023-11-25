import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Stack {
    private List<String> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(String item) {
        stack.add(item);
    }

    public String pop() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return stack.remove(stack.size() - 1);
    }
}