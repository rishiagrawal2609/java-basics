package Lecture1;

public class BasicsDataType {

    public static void main(String[] args) {
        byte age = 127;
        //age++;
        age = (byte) (age + 1);
        System.out.println(age);

        // Int
        // byte - 8 bits / short - 16 bits / int - 32 bits / long 64 bits

        //Float
        // Float, double
        float x = 23.0f;
        double y = 23.0;

        float i = 1111111111111111111.111111111111111111111111111111111f;
        double j = 1111111111111111111.111111111111111111111111111111111 ;
        System.out.println(i);
        System.out.println(j);

        //Characters
        char ch = 'a';
        System.out.println(ch);

        String namaste = "नमस्ते";
        System.out.println(namaste.charAt(0));

        //boolean
        boolean a = false;
    }
}
