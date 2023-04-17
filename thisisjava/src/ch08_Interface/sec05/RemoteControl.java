package ch08_Interface.sec05;

//완전한 실행코드를 가진 디폴트 메소드(실행부인 {}있는 메소드) 선언가능
//선언방법 default키워드가 리턴타입 앞에 붙고 그 외에는 클래스메소드와 동일
//[public] default 리턴타입 메소드명(매개변수,....){...}
//디폴트 메소드 실행부에는 상수필드 읽기가능,추상메소드 호출코드 작성 가능
public interface RemoteControl {
    // 상수필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상메소드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    // 디폴트 인스턴스 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리");

            // 추상메소드 호출하면서 상수필드 적용
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음해제");
        }
    }
}
