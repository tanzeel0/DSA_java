public class operators {
    public static void main(String[] args) {
        //And
        //   1 1 0 1
        //   0 1 1 1
        //  ---------
        //   0 1 0 1  5

        int and = 13 & 7;
        System.out.println(and);


        // OR
        //  1 1 0 1
        //  0 1 1 1
        //  --------
        //  1 1 1 1    15
        int or = 13 | 7;
        System.out.println(or);

        //XOR
        //  1 1 0 1
        //  0 1 1 1
        // ---------
        //  1 0 1 0   10

        int xor = 13 ^ 7;
        System.out.println(xor);


        //RightShift
        //      1101  >> 1
        //      ----
        //      110    6

        int rightshift = 13 >> 1;
        System.out.println(rightshift);

        //RightShift
        //   13 / 2**k      k -> 1,2,3,4....

        rightshift = 13/(int)Math.pow(2,1);
        System.out.println(rightshift);


        //leftShift
        //      1101  << 1
        //      -----
        //      11010

        int leftShift = 13 << 1;
        System.out.println(leftShift);

        //leftShift
        // 13 * 2**k        k -> 1,2,3,4....

        leftShift = 13 * (int)Math.pow(2, 1);
        System.out.println(leftShift);

        //Not   ~
        // 2's complement
        int x = ~ (5);
        System.out.println(x);

        int y = ~ (-5);
        System.out.println(y);
    }
}
