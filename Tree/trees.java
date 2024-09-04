public class trees{

    public static class node{
        int val;
        node left; //null
        node right; //null
        public node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        node root = new node(10);

        node a = new node(1);
        node b = new node(2);
        root.left = a;
        root.right = b;

        node c = new node(3);
        node d = new node(4);
        a.left = c;
        a.right = d;

        node e = new node(5);
        node f = new node(6);
        b.left = e;
        b.right = f;
        display(root);
    }

    static void display(node root){
        //pre-order traversal
        if(root == null) return;
        System.out.print(root.val + " -> ");
        if(root.left != null) System.out.print(root.left.val + ", ");
        if(root.right != null) System.out.print(root.right.val + ", ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
}