package LinkedLists;

import main.java.LinkedLists.QueueImpl;
import main.java.LinkedLists.StackImpl;
import org.junit.Test;

public class QueueTest {
    @Test
    public void addTest(){
        QueueImpl queue = new QueueImpl();

        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.toString());
    }

    @Test
    public void popTest(){
        QueueImpl queue = new QueueImpl();

        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.toString());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.toString());
    }
}
