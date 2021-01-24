package jv.in.thinking.holding.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author: shiwenwei
 * @date: 2020/12/30 11:04 PM
 * @since v1.0
 */
public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i + 10));
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    } /* Output:
    8 1 1 1 5 14 3 1 0 1
    B r o n t o s a u r u s
    *///:~

    public static void printQ(Queue<?> queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

}
