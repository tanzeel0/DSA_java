public class circularLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    static void displayCircular(Node head){
        Node temp = head;
        //System.out.print(head.data + " ");
        while(temp != head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static void deleteHead(Node head){
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = head.next;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(5);
        Node c = new Node(10);
        Node d = new Node(15);
        Node e = new Node(20);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;
        displayCircular(a);
        //System.out.println();
        //deleteHead(a);
        //displayCircular(a);
    }
}
