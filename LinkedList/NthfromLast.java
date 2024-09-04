public class NthfromLast {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node nthNode(Node head,int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        int idx = size-n+1;
        temp = head;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(90);
        Node c = new Node(80);
        Node d = new Node(70);
        Node e = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node p = nthNode(a,2);
        System.out.println(p.data);
    }
}
