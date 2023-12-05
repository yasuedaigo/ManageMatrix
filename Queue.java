import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// キュー
public class Queue {
    private List<String> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    // 要素を追加する
    public void push(String item) {
        queue.add(item);
    }

    // 要素をFIFOで取り出す
    public String pop() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.remove(0);
    }
}