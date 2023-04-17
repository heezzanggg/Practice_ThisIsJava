package ch08_Interface.sec10.exam01;

//타입변환 : 인터페이스와 구현클래스 간에 발생
//인터페이스 변수에 구현객체 대입하면 구현객체는 인터페이스타입으로 타입 변환 (자동타입변환)
//브모클래스가 인터페이스를 구현하고 있다면 자식 클래스도 인터페이스 타입으로 자동 타입 변환 가능
//강제타입변환 :인터페이스타입을 구현클래스 타입으로 변환
public class PromotionExample {
    public static void main(String[] args) {
        // 구현객체 생성
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 인터페이스 변수 선언
        A a;

        // 인터페이스 변수에 구현 객체 대입
        a = b; // A<-B (자동타입변환)
        a = c; // A<-C (자동타입변환)
        a = d; // A<-D (자동타입변환)
        a = e; // A<-E (자동타입변환)
    }
}
