package LinkedLists;

import java.util.EmptyStackException;

public class QueueImpl {
    private QueueNode head = null;
    private QueueNode cur = null;

    public void add(int val){
        QueueNode node = new QueueNode(val);
        if(head == null) {
            head = node;
            cur = head;
        } else {
           cur.next = node;
           cur = cur.next;
            if(head.next == null){
                head.next = cur;
            }
        }
    }

    public int remove(){
        if(head == null)
            throw new EmptyStackException();
        int val = head.val;
        head = head.next;

        return val;
    }

    public String toString(){
        if(head == null)
            throw new EmptyStackException();

        StringBuilder sb = new StringBuilder();
        int i=0;
        QueueNode cur1 = head;
        while(cur1!=null){
           if(i!=0)
               sb.append("->");

           sb.append(cur1.val);
           cur1 = cur1.next;
           i++;
        }
        return sb.toString();
    }

    private class QueueNode{
       QueueNode next = null;
       int val;

       QueueNode(int val){
           this.val = val;
       }
    }
}
