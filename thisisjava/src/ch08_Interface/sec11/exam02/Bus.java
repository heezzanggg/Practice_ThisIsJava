package ch08_Interface.sec11.exam02;

public class Bus implements Vehicle {
    // 추상메소드 재정의
    @Override
    public void run() {
        System.out.println("버스달립니다.");
    }
}
