package Lecture3.Composition;

public class CarDemo {
    public static void main(String[] args) {
        CarComp mycar = new CarComp("mypass");
        mycar.start("mypass");
        mycar.stop();
        mycar.acc();
        Engine engine = new TurboEngine();
        mycar.changeEngine(engine);
        mycar.start("mypass");
        mycar.stop();
    }
}
