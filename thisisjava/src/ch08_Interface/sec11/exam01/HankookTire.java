package ch08_Interface.sec11.exam01;

public class HankookTire implements Tire {
    // 추상메소드 재정의
    @Override
    public void roll() {
        System.out.println("한국타이어 굴러감");
    }
}
