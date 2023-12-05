import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

// ランダムキュー
public class RandomQueue {
    private List<String> itemList;
    private Random random;

    public RandomQueue() {
        itemList = new ArrayList<>();
        random = new Random();
    }

    // 要素を追加する
    public void push(String item) {
        itemList.add(item);
    }

    // 要素をランダムに取り出す
    public String pop() {
        if (itemList.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        // ランダムな要素番号を取得する
        int randomIndex = random.nextInt(itemList.size());
        return itemList.remove(randomIndex);
    }
}