package ch08.sec11.exam02;

public class Taxi implements Vehicle {
    //추상메소드 재정의
    @Override
    public void run() {
        System.out.println("택시 달립니다.");
    }
}
