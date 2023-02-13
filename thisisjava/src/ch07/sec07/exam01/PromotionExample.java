package ch07.sec07.exam01;
//자동타입변환 (p.305)
//자식은 부모의 특징과 기능을 상속받기 때문에 부모와 동일하게 취급될 수 있다.
//부모타입으로 자동 타입 변환 됨
// -> 부모클래스에 선언된 필드와 메소드만 접근이 가능
//but, 자식클래스에서 오버라이딩 된 메소드가 있다면 부모메소드 대신 오버라이딩된 메소드가 호출됨


class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionExample {
    public static void main(String[] args){
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        //자동타입변환(상속관계있음)
        //부모타입으로 자동 타입 변환 됨 -> 부모클래스에 선언된 필드와 메소드만 접근이 가능
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        //컴파일 에러 (상속관계 있지 않으므로)
        //B b3 = e;
        //C c3 = d;

    }
}
