public class doublyList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
        }
    }
    static void delete(Node head,int idx){
        if(idx == 0){
            head = head.next;
            head.prev = null;
        }
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    static void displayrev(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static void insertatTail(Node head,int val){
        Node temp = head;
        Node t = new Node(val);
        while(temp.next != null){
            temp = temp.next;
        }
        t.prev = temp;
        t.next = null;
        temp.next = t;    
    }
    static void insert(Node head, int idx, int val){
        Node temp = head;
        Node t = new Node(val);
        for(int i=0; i<idx-1; i++) temp = temp.next;
        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next=b;b.prev = a;
        b.next=c;c.prev = b;
        c.next=d;d.prev = c;
        d.next=e;e.prev = d;
        displayrev(e);
        System.out.println();
        insert(a,2,5);
        display(a);
        System.out.println();
        insertatTail(a, 6);
        display(a);
        System.out.println();
        delete(a, 2);
        display(a);
    }
}
