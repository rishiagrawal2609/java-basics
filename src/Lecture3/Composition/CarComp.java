package Lecture3.Composition;

import java.security.PublicKey;

public class CarComp {
    private Engine engine;
    private String password;
    public CarComp(String password){
        this.engine = new Engine();
        this.password = password;
    }
    public  void start(String password){
        if (checkPassword(password)) {
            engine.start();
        }
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void changeEngine(Engine engine){
        this.engine = engine;
    }
    private boolean checkPassword(String password){
        return this.password.equals(password);
    }
}
