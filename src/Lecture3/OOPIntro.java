package Lecture3;

class Human{
    public Human(String Name){
        this.name = Name;
    }
    //sates
    String name;
    int age;
    int legs;
}
public class OOPIntro {
    public static void main(String[] args) {
        Human rishi = new Human("Rishi Agrawal");
        System.out.println(rishi.name);
    }
}
