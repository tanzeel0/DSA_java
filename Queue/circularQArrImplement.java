public class circularQArrImplement {

    static class queue{
        int arr[] = new int[5];
        int f = -1,r = -1;
        int size =0;
        void add(int x) throws Exception{
            if(size == 0){
                f=0;
                r=0;
                arr[0] = x;
            }
            else if(size == arr.length){
                throw new Exception("Queue is full");
            }
            else if(r<arr.length-1){
                arr[++r] = x;
            }
            else if(r == arr.length-1){
                r = 0;
                arr[0] = x;
            }
            size++;
        }
        int remove() throws Exception{
            if(size == 0) throw new Exception("Queue is Empty");
            else{              
                int x = arr[f];
                if(f == arr.length-1) f = 0;
                else f++;
                size--;
                return x;
            }
        }
        int peek() throws Exception{
            if(size == 0) throw new Exception("Queue is Empty");
            else return arr[f];
        }
        boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
        void display(){
            if(size == 0) System.out.println("Queue is empty");
            else if(f<=r){
                for(int i=f; i<=r; i++) System.out.print(arr[i] + " ");
            }
            else{
                for(int i=f; i<arr.length; i++) System.out.print(arr[i] + " ");
                for(int i=0; i<=r; i++) System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception{
        queue q = new queue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println();
        q.remove();
        q.remove();
        q.display();
        System.out.println();
        for(int i=0; i<q.arr.length; i++){
            System.out.print(q.arr[i] + " ");
        }
    }
}
