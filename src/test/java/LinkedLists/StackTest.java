package LinkedLists;

import hex.genmodel.easy.RowData;
import main.java.LinkedLists.LinkedListImpl;
import main.java.LinkedLists.StackImpl;
import org.junit.Test;

public class StackTest {
    @Test
    public void addTest(){
        StackImpl stack = new StackImpl();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.toString());
    }

    @Test
    public void popTest(){
        StackImpl stack = new StackImpl();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
    }

    @Test
    public void justTEst(){

    }
}
