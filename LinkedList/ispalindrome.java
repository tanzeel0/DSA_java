public class ispalindrome {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
        }
    }
    static void twosum(Node head,int tgt){
        Node temp = head;
        Node st = head;
        while(temp.next != null) temp = temp.next;
        while(temp.data != head.data){
            if(temp.data + st.data == tgt) {
                System.out.println(st.data + " " + temp.data);
                return;
            }
            else if(temp.data + st.data < tgt) st = st.next;
            else temp = temp.prev;
        }
    }
    static boolean palindrome(Node head){
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        while(head != temp){
            if(head.data != temp.data){
                return false;
            }else{
                head = head.next;
                temp = temp.prev;
            }
        }
        return true;
    }
    static void dist(Node head){
        Node temp = head.next;
        Node criticalmin = null;
        Node criticalmax = null;
        int dist = 0;
        while(temp.next != null){
            if(temp.prev.data > temp.data && temp.data < temp.next.data) criticalmin = temp;

            if(temp.prev.data < temp.data && temp.data > temp.next.data) criticalmax = temp;
            temp = temp.next;
        }
        while(criticalmax != criticalmin){
            dist++;
            criticalmax = criticalmax.next;
        }
        System.out.println(dist);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        a.next=b;b.prev = a;
        b.next=c;c.prev = b;
        c.next=d;d.prev = c;
        d.next=e;e.prev = d;
        System.out.println(palindrome(a));
        //twosum(a,5);
        dist(a);
    }
}
