package Lecture2;

class Human {}
public class heapMem {
    public static void main(String[] args) {
        String anil = "Anil";
        String baby = anil;
        String ram = "Ram";
        System.out.println(baby);
        baby = ram;
        System.out.println(baby);


        Human amit = new Human();
        Human babu = amit;
        Human alok = new Human();
        System.out.println(amit);
        System.out.println(babu);
        System.out.println(alok);
        babu = alok;
        System.out.println(amit);
        System.out.println(babu);
        System.out.println(alok);
    }
}
