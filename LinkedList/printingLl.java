public class printingLl {
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
    public static void display(Node head){
            if(head == null) return;
            Node temp = head;
            System.out.print(temp.data + " ");
            display(temp.next);
    }
    public static void displayRev(Node a){
        if(a == null) return;
        displayRev(a.next);
        System.out.print(a.data + " ");
    }
    // public static int length(Node head,int count){
    //     if(head == null) return count;
    //     else return length(head, count++);
        
    // }
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
        // 
        // for(int i=1; i<=5;i++){
        //     System.out.print(temp.data + "->");
        //     temp = temp.next;
        // }

        // while(temp != null){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        Node temp = a;
        int cnt =0;
        //System.out.println(length(a,cnt));
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        System.out.println(cnt);
        display(a);
        System.out.println();
        insertAtEnd(a, 6);
        display(a);
    }
}
