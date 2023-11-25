import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomQueue {
    private List<String> itemList;
    private Random random;

    public RandomQueue() {
        itemList = new ArrayList<>();
        random = new Random();
    }

    public void push(String item) {
        itemList.add(item);
    }

    public String pop() {
        if (itemList.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int randomIndex = random.nextInt(itemList.size());
        return itemList.remove(randomIndex);
    }
}