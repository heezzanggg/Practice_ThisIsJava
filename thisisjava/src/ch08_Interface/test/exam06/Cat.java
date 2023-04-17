package ch08_Interface.test.exam06;

public class Cat implements Soundable {
    // 추상메소드 오버라이딩
    @Override
    public String sound() {
        return "야옹";
    }
}
