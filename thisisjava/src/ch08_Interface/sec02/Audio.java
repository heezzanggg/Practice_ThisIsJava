package ch08_Interface.sec02;

public class Audio implements RemoteControl {
    // implements 키워드는 해당 클래스가 인터페이스를 통해 사용할 수 있다는 표시. 인터페이스의 추상 메소드를 재정의한 메소드가 있음
    @Override
    public void turnOn() {
        System.out.println("Audio 켬");
    } // 인터페이스에 선언된 turnOn()메소드 오버라이딩

}
