package ch08_Interface.sec05;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수선언
        RemoteControl rc;

        // Television객체 생성, 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(20);

        // 디폴트메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println("=========");

        // Audio객체 생성, 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        // 디폴트메소드 호출
        rc.setMute(true);
        rc.setMute(false);
    }

}
