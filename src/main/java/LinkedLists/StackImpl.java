package LinkedLists;

import java.util.EmptyStackException;

public class StackImpl {
    StackNode tail = null;

    public void push(int val){
       StackNode newNode = new StackNode(val);
       if(tail == null)
          tail = newNode;
       else{
           newNode.previous = tail;
           tail = newNode;
       }
    }

    public int pop(){
        if(tail == null)
            throw new EmptyStackException();

        int popped = tail.val;
         tail = tail.previous;
         return popped;
    }

    private class StackNode{
        StackNode previous = null;
        int val;

        private StackNode(int val){
            this.val = val;
        }
    }

    public String toString(){
        if(tail == null)
            throw new EmptyStackException();

        StringBuilder sb = new StringBuilder();
        int i=0;
        StackNode tail1 = tail;
        while(tail1 != null){
           if(i!=0){
               sb.append("<-");
           }
           sb.append(tail1.val);
           tail1 = tail1.previous;
           i++;
        }
        return sb.toString();
    }
}
