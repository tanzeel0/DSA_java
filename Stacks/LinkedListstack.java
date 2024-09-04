
public class LinkedListstack {

    static class node{
        int val;
        node next;
        public node(int val){
            this.val = val;
        }
    }
    public static class LLstack{
        private node head = null;
        private int size = 0;

        void push(int x){
            node temp = new node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrec(node h){
            if(h == null) return;
            displayrec(h.next);
            System.out.print(h.val + " ");
        }

        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayRev(){
            node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            if(isEmpty()){
                System.out.println("stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(isEmpty()){
                System.out.println("stack is Empty");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }

    }
    public static void main(String[] args) {
        LLstack s = new LLstack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        s.displayRev();
        s.display();
    }
}
