package ch08_Interface.sec08;

public class SmartTelevision implements RemoteControl, Searchable {

    // interface의 추상메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("tv 켬");
    }

    @Override
    public void turnOff() {
        System.out.println("tv 끔");
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 을 검색");
    }
}
