package LinkedLists;

import main.java.LinkedLists.LinkedListImpl;
import org.junit.Test;

public class LinkedListsTest {

    @Test
    public void linkedListAddTest(){
        LinkedListImpl linkedList = new LinkedListImpl();

        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList.toString());
    }

    @Test
    public void linkedListRemoveTest(){
        LinkedListImpl linkedList = new LinkedListImpl();

        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList.toString());
        linkedList.remove(5);
        System.out.println(linkedList.toString());
    }
}
