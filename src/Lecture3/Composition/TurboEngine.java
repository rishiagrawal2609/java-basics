package Lecture3.Composition;

public class TurboEngine extends Engine{
    public void start(){
        System.out.println("Turbo Engine Starts");
    }
    public void stop(){
        System.out.println("Turbo Engine Stops");
    }

    public void acc(){
        System.out.println("Turbo engine Accelerates");
    }
}
