import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue {
    private List<String> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    public void push(String item) {
        queue.add(item);
    }

    public String pop() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.remove(0);
    }
}