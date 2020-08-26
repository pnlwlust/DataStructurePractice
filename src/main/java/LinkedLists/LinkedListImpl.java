package LinkedLists;

public class LinkedListImpl {
    private Node head = null;

    public void add(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        Node last = head;
        while(last.next != null){
           last = last.next;
        }
        last.next = node;
    }

    public void remove(int val){
        if(head == null) return;

        Node cur = head;
        Node previous = null;
        Node next = head.next;
        while(cur.value != val){
            previous = cur;
            next = cur.next.next;
            cur = cur.next;
        }


        if(previous == null) { head = cur.next;}
        else if(next == null){previous.next = null;}
        else{ previous.next = cur.next; }
        cur = null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        int i=0;
        Node last = head;
        while(last != null){
            if(i!=0)
                str.append("->");
            str.append(last.value);
            last = last.next;
            i++;
        }
        return str.toString();
    }
}
class Node{
    Node next = null;
    int value;

    Node(int value){
        this.value = value;
    }
}

