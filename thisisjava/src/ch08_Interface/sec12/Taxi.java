package ch08_Interface.sec12;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시달립니다.");
    }
}
