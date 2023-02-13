package ch07.sec08.exam01;
//다형성 : 사용방법은 동일하지만 실행결과가 다양하게 나오는 성질, 다형성 구현위해서는 자동타입변환과 메소드 재정의 필요하다.
//-객체사용법 동일 ? 동일한 메소드 가지고있다.
//필드 다형성 : 필드타입은 동일(사용법 동일)하지만 대입되는 객체가 달라져서 실행결과가 다양하게 나올 수 있다.
//매개변수 다형성:
public class KumhoTire extends Tire {
    //메소드 재정의(오버라이딩)
    @Override
    public void roll(){
        System.out.println("금호타이어 회전");
    }
}
