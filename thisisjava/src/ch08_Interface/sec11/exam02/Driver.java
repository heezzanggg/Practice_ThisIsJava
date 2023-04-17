package ch08_Interface.sec11.exam02;

public class Driver {
    void driver(Vehicle vehicle) {
        vehicle.run();
        // 구현객체가 대입될 수 있도록 매개변수를 인터페이스타입으로 선언
        // 인터페이스 메소드 호출
    }
}
