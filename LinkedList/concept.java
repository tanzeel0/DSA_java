public class concept{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static void insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        t.next = temp;
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
        System.out.print(a.data + "->" + a.next.data+ "->"+a.next.next.data+ "->"+ a.next.next.next.data + "->" +a.next.next.next.next.data);
        insertAtEnd(a,6);
    }
}