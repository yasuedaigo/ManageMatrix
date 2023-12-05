import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// スタック
public class Stack {
    private List<String> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    // 要素を追加する
    public void push(String item) {
        stack.add(item);
    }

    // 要素をLIFOで取り出す
    public String pop() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return stack.remove(stack.size() - 1);
    }
}