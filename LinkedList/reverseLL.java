public class reverseLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
        
    }
    //iterative soln
    public static Node reverseList(Node h){
        if(h == null) return null;
        if(h.next == null) return h;
        Node cur = h;
        Node after = null;
        Node prev = null;
        while(cur != null){
            after = cur.next;
            cur.next = prev;
            prev = cur;
            cur = after;

        }
        return prev;
    }
    public static void display(Node head){
        Node temp = head;
        if(temp == null) return;
        System.out.print(temp.data + " ");
        display(temp.next);
    }
    public static void displayreverse(Node head){
        Node temp = head;
        if(temp == null) return;
        displayreverse(temp.next);
        System.out.print(temp.data + " "); 
    }
    //recursive soln
    public static Node reverse(Node h){
        if(h.next == null) return h;
        Node newh = reverse(h.next);
        h.next.next = h;
        h.next = null;
        return newh;
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
        display(a);
        System.out.println();
        Node rev = reverseList(a);
        display(rev);
    }
}
