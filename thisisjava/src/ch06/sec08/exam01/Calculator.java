package ch06.sec08.exam01;

//메소드 호출
public class Calculator {

    // 리턴타입 메소드명 (매개변수,...){ 실행할 코드 작성하는 곳 ; 실행블록}
    // 리턴타입이 없을 경우 void 사용

    // 리턴값이 없는 메소드 선언
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    // 리턴값이 없는 메소드 선언
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // 호출시 두 정수 값을 전달받고,
    // 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    // 호출시 두 정수 값을 전달받고
    // 호출한 곳으로 결과괎 double을 리턴하는 메소드 선언
    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }
}
