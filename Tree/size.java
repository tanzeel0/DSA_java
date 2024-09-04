public class size {
    //static int cnt = 0;
    public static class node{
        int val;
        node left; //null
        node right; //null
        public node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        node root = new node(2);

        node a = new node(4);
        node b = new node(10);
        root.left = a;
        root.right = b;

        node c = new node(6);
        node d = new node(5);
        a.left = c;
        a.right = d;

        node f = new node(11);
        b.right = f;
        preorder(root);
        //System.out.println(cnt);
        System.out.println();
        System.out.println(treesize(root));
    }
    static void preorder(node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        //cnt++;
        preorder(root.left);
        preorder(root.right);
    }
    static int treesize(node root){
        if(root == null) return 0;
        return 1 + treesize(root.right) + treesize(root.left);
    }
}