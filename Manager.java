public class Manager {
    public static void main(String[] args) {
        //課題1
        RandomQueue queue = new RandomQueue();
        queue.push("１番目");
        queue.push("２番目");
        queue.push("３番目");
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        //課題2
        Stack stack = new Stack();
        stack.push("１番目");
        stack.push("２番目");
        stack.push("３番目");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //課題3
        RandomQueue randomQueue = new RandomQueue();
        randomQueue.push("１番目");
        randomQueue.push("２番目");
        randomQueue.push("３番目");
        System.out.println(randomQueue.pop());
        System.out.println(randomQueue.pop());
        System.out.println(randomQueue.pop());

        //課題4
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.push("1 番目", 10);
        priorityQueue.push("2 番目", 10);
        priorityQueue.push("3 番目", 100);
        priorityQueue.push("4 番目", 50);
        System.out.println(priorityQueue.pop());
        System.out.println(priorityQueue.pop());
        System.out.println(priorityQueue.pop());
        System.out.println(priorityQueue.pop());
    }
}

