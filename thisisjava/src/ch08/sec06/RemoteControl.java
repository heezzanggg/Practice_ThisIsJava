package ch08.sec06;

//인터페이스 정적메소드 선언 가능
//추상메소드, 디폴트 메소드는 구현 객체 필요 but 정적메소드는 구현객체 없어도 인터페이스만으로 호출가능
//public 생략해도 컴파일 과정에서 자동으로 생성됨(클래스와의 차이점)
//그 이외 클래스의 정적메소드와 선언방법 동일
//[public | private] static 리턴타입 메소드명(매개변수,....){....}
public interface RemoteControl {
    //상수필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //디몰트 메소드
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음처리");
            //추상메소드 호출하면서 상수필드 적용
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("무음해제");
        }
    }

    //정적메소드
    static void changeBattery(){
        System.out.println("리모콘 건전지를 교체합니다.");
    }

}
