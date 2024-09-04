public class LLImplementation {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queue{
        Node head = null;
        Node tail = null;
        int size = 0;
        void add(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int peek(){
            if(size == 0) {
                System.out.println("Empty");
                return -1;
            }
            return head.val;
        }

        int remove(){
            if(size == 0) {
                System.out.println("Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        void display(){
            Node temp = head;
            if(size == 0) {
                System.out.println("Empty");
                return;
            }
            else{
                while(temp != null){
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
            }
        }
        boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(2);
        q.add(5);
        q.add(9);
        q.add(11);
        q.display();
        int m = q.remove();
        q.display();
        System.out.println(m);
    }
}
