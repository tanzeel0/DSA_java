public class addMethod {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;
        int size =0;
        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insert(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size) add(val);
            else if(idx == 0) insertAtStart(val);
            else{
                for(int i=1; i<=idx-1; i++){
                temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
                size++;
            }
        }
        void add(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            
        }
        void deleteAt(int idx){
            if(idx == 0) head = head.next;
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
        // int length(){
        //     int cnt = 0;
        //     Node temp = head;
        //     while(temp != null){
        //         cnt++;
        //         temp = temp.next;
        //     }
        //     return cnt;
        // }
        int getElement(int idx){
            Node temp = head;
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.insertAtStart(5);
        ll.insert(2, 6);
        ll.display();
        System.out.println();
        System.out.println(ll.getElement(4));
        System.out.println(ll.size);
        ll.deleteAt(0);
        ll.display();
    }
}
