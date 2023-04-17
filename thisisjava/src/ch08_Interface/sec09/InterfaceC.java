package ch08_Interface.sec09;

//인터페이스도 다른 인터페이스 상속 할 수 있음 (다중 상속 허용)
//public interface 자식인터페이스 extends 부모인터페이스1, 부모인터페이스2...{}
//자식인터페이스의 구현 클래스는 자식인터페이스,부모인터페이스의 모든 추상메소드 재정의 해야함.
//그리고 구현 객체는 자식및 부모 인터페이스 변수에 대입될 수 있다.
//자식인터페이스 변수 = new  구현클래스();  부모인터페이스 변수 = new 구현클래스();
//구현객체가 자식 인터페이스 변수에 대입되면 자식 및 부모 인터페이스의 추상 메소드를 모두 호출 할 수 있으나
//구현객체가 부모 인터페이스 변수에 대입되면 부모 인터페이스에 선언된 추상 메소드만 호출 가능
//구현할 클래스에서 interface 상속할때는 public class 클래스이름ㄹ implements 인터페이스명
public interface InterfaceC extends InterfaceA, InterfaceB {
    // 추상메소드
    void methodC();

}
