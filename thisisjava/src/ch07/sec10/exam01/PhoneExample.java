package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args){
        //Phone phone = new Phone();
        // 추상클래스는 실체클래스의 공통되는 필드와 메소드를 추출해서 만들었기때문에 new 연산자 사용해서 객체 직접 생성 불가

        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
        //turnOn(),turnOff()메소드는 Phone의 메소드
    }
}
