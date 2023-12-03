package Lecture3;

public class Playground {
    public static void main(String[] args) {
        Car newcar = new Car();
        newcar.start();
        newcar.acc();
        newcar.stop();
        System.out.println(newcar.wheels);

        SuperCar car = new SuperCar();
        car.start();
        car.acc();
        car.stop();
        System.out.println(car.wheels);
    }
}
