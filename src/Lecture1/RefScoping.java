package Lecture1;

public class RefScoping {
    public static void main(String[] args) {
        int a = 8;
        {
            int c = 20;
            System.out.println(c);
        }
        //System.out.println(c); Not allowed - block is a scope.
        if (a>6){
            int b= 10;
            //int  a = 20; This is not allowed in Java
            System.out.println(a);
            System.out.println(b);
        }
        //System.out.println(b); b is out of scope
    }

}
