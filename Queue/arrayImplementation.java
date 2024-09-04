public class arrayImplementation {

    public static class queue{
        int f=-1, r = -1;   
        int arr[] = new int[1000];
        int size = 0;
        void display(){
            if(size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            for(int i=f; i<=r; i++){
                System.out.print(arr[i] + " ");
            }
        }
        void add(int x){
            if(r == arr.length-1){
                System.out.println("queue is full");
                return;
            }
            if(f == -1){
                f = 0;
                r = 0;
                arr[0] = x;
            }
            else{
                arr[++r] = x;
            }
            
            size++;
        }
        int remove(){
            if(size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            
            f++;
            size--;
            return arr[f-1];
        }
        int peek(){
            if(size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(5);
        q.add(4);
        q.add(1);
        q.add(6);
        q.display();
        System.out.println();
        q.remove();
        q.display();
        System.out.println();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
