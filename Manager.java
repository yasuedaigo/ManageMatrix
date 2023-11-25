public class Manager {
    public static void main(String[] args) {
        // Queue クラスを生成
        RandomQueue queue = new RandomQueue();
        // キューに追加する
        queue.push("１番目");
        queue.push("２番目");
        queue.push("３番目");
        // キューから取り出して表示する
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        // Stack クラスを生成
        Stack stack = new Stack();
        // スタックに追加する
        stack.push("１番目");
        stack.push("２番目");
        stack.push("３番目");
        // スタックから取り出して表示する
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // RandomQueue クラスを生成
        RandomQueue randomQueue = new RandomQueue();
        // キューに追加する
        randomQueue.push("１番目");
        randomQueue.push("２番目");
        randomQueue.push("３番目");
        // キューから取り出して表示する
        System.out.println(randomQueue.pop());
        System.out.println(randomQueue.pop());
        System.out.println(randomQueue.pop());

        // Queue クラスを生成
        PriorityQueue priorityQueue = new PriorityQueue();
        // キューに追加する
        priorityQueue.push("1 番目", 10);
        priorityQueue.push("2 番目", 10);
        priorityQueue.push("3 番目", 100);
        priorityQueue.push("4 番目", 50);
        // キューから取り出して表示する
        System.out.println(priorityQueue.pop());
        System.out.println(priorityQueue.pop());
        System.out.println(priorityQueue.pop());
        System.out.println(priorityQueue.pop());
    }
}

