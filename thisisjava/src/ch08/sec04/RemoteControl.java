package ch08.sec04;
//인터페이스는 'public 추상메소드'를 멤버로 가질 수 있음
//추상메소드 : 리턴타입, 메소드명,매개변수만 기술되고 {}붙이지 않음 '[public abstract] 리턴타입 메소드명(매개변수,...);'
//추상메소드는 객체가 인터페이스를 통해 어떻게 메소드를 호출할 수 있는지 방법을 알려주는 역할
//인터페이스 구현객체(implement한 클래스) 추상메소드의 실행부를 갖는 재정의된 메소드 필요
//구현 클래스에서 추상 메소드 재정의할때 주의 점: 인터페이스의 추상메소드보다 더 낮은 접근 제한으로 재정의 불가
public interface RemoteControl {
    //상수필드 (public static final)
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

}
