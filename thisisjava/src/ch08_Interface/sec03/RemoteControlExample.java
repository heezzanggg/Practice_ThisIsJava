package ch08_Interface.sec03;

//상수는 구현 객체와 관련없는 인터페이스 소속 멤버이므로 인터페이스로 바로 접근해서 상수값 읽기 가능
public class RemoteControlExample {
    public static void main(String[] args) {
        System.out.println("리모콘 최대 볼륨:" + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최저 볼륨:" + RemoteControl.MIN_VOLUME);
    }
}
