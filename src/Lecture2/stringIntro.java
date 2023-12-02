package Lecture2;


public class stringIntro {
    public static void main(String[] args) {
        String welcome  = "Hello World";
        System.out.println(welcome);
        System.out.println(welcome.charAt(0));
        System.out.println(welcome.length());

        String one = "Hello";
        String two = "Hello";
        String three = new String("Hello");

        System.out.println(one == two);
        System.out.println(one == three);

        System.out.println(one.equals(two));
        System.out.println(one.equals(three));

        System.out.println(welcome.indexOf("W"));

        System.out.println(welcome.contains("llo"));
    }
}
