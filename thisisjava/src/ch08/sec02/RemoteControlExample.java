package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args){
        RemoteControl rc; //인터페이스 변수 선언
        rc = new Television(); // 인터페이스 변수에 구현 객체 대입

        //RemoteControl rc = new Television(); //변수선언과 동시에 구현 객체 대입 가능(5,6번째 줄 한번에)
        rc.turnOn(); //TV켬

        //rc변수에 Audio객체 대입(교체)
        rc = new Audio();
        rc.turnOn(); //Audio 켬
    }
}
