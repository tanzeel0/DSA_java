
class arrayStack{

    public static class stack{
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x){
            if(isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx++] = x;
        }

        int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        boolean isFull(){
            if( idx == arr.length) return true;
            else return false;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }

        int size(){
            return idx;
        }
        int capacity(){
            return arr.length;
        }

        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i=0; i<idx; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        System.out.print(s.capacity());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.pop());
        s.display();
    }
}