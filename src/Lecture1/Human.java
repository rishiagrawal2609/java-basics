package Lecture1;

class Human {
    int hands;
    int legs;
    int head;
    String name;

    void eat(){
        System.out.println("This person eats");
    }
    void dance(){
        System.out.println("This person Walks");
    }
}

class Life {
    public static void main(String[] args) {
        Human rishi = new Human();
        rishi.dance();
        rishi.name = "Rishi Agrawal";
        System.out.println(rishi.name);
    }
}
