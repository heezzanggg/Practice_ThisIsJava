package ch08_Interface.sec11.exam01;

public class Car {
    // 필드
    Tire tire1 = new HankookTire();
    Tire tire2 = new KumhoTire();

    // 메소드
    void run() { // 인터페이스에 선언된 추상메소드 호출 ->구현객체의 roll()메소드 실행
        tire1.roll();
        tire2.roll();
    }
}
