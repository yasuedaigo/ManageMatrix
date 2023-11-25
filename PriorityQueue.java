import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PriorityQueue {
    private List<QueueItem> queue;

    public PriorityQueue() {
        queue = new ArrayList<>();
    }

    // 内部クラスで、要素とその優先度を関連付ける
    private static class QueueItem {
        String item;
        int priority;

        QueueItem(String item, int priority) {
            this.item = item;
            this.priority = priority;
        }
    }

    public void push(String item, int priority) {
        QueueItem queueItem = new QueueItem(item, priority);
        queue.add(queueItem);
    }

    public String pop() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        // 最高優先度の要素を探す
        int highestPriorityIndex = 0;
        for (int i = 1; i < queue.size(); i++) {
            if (queue.get(i).priority > queue.get(highestPriorityIndex).priority) {
                highestPriorityIndex = i;
            }
        }

        // 最高優先度の要素を取り出して返す
        return queue.remove(highestPriorityIndex).item;
    }
}