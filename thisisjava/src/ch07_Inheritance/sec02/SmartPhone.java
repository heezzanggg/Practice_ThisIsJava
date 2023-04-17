package ch07_Inheritance.sec02;

//상속 : 자식클래스 extends 부모클래스
public class SmartPhone extends Phone {

    // 필드선언
    public boolean wifi;

    // 생성자 선언
    public SmartPhone(String model, String color) {// Phone으로 부터 상속받은 필드
        this.model = model;
        this.color = color;
    }

    // 메소드선언
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태 변경하였습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
